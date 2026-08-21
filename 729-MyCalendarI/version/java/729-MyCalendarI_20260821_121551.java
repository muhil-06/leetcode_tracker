// Last updated: 21/08/2026, 12:15:51
1class Solution {
2    public int[] numberOfLines(int[] widths, String s) {
3        int line=1;
4        int current=0;
5        for(char c:s.toCharArray()){
6            int w=widths[c-'a'];
7            if(current+w>100){
8                line++;
9                current=w;
10            }else{
11                current+=w;
12            }
13        }
14        return new int[]{line,current};
15    }
16}