// Last updated: 04/08/2026, 11:42:35
1class Solution {
2    public int minFlipsMonoIncr(String s) {
3        int one=0;
4        int flip=0;
5        for(int i=0;i<s.length();i++){
6            if(s.charAt(i)=='1'){
7                one++;
8            }else{
9                flip=Math.min(flip+1,one);
10            }
11        }
12        return flip;
13    }
14}