// Last updated: 14/08/2026, 11:31:46
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3         char[]a=s1.toCharArray();
4         Arrays.sort(a);
5         for(int i=0;i<=s2.length()-s1.length();i++){
6            String sub=s2.substring(i,i+s1.length());
7            char[]b=sub.toCharArray();
8            Arrays.sort(b);
9            if(Arrays.equals(a,b)){
10                return true;
11            }
12         }
13         return false;
14    }
15}