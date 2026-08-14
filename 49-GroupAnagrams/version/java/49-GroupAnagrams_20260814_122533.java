// Last updated: 14/08/2026, 12:25:33
1class Solution {
2    public int compareVersion(String version1, String version2) {
3        String[]a=version1.split("\\.");
4        String[]b=version2.split("\\.");
5        int n=Math.max(a.length,b.length);
6        for(int i=0;i<n;i++){
7            int x=0;
8            int y=0;
9            if(i<a.length){
10                x=Integer.parseInt(a[i]);
11            }
12            if(i<b.length){
13                y=Integer.parseInt(b[i]);
14            }
15            if(x>y){
16                return 1;
17            }
18            if(x<y){
19                return -1;
20            }
21        }
22        return 0;
23    }
24}