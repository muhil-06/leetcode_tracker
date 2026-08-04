// Last updated: 04/08/2026, 12:29:39
1class Solution {
2    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
3        StringBuilder result = new StringBuilder();
4        for (int i = 0; i < s.length(); i++) {
5            boolean replaced = false;
6            for (int j = 0; j < indices.length; j++) {
7                if (i == indices[j] &&
8                    s.startsWith(sources[j], i)) {
9                    result.append(targets[j]);
10                    i += sources[j].length() - 1;
11                    replaced = true;
12                    break;
13                }
14            }
15            if (!replaced) {
16                result.append(s.charAt(i));
17            }
18        }
19        return result.toString();
20    }
21}