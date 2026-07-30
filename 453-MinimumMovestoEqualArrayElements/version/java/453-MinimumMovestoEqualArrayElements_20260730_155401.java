// Last updated: 30/07/2026, 15:54:01
1class Solution {
2    public int minMoves(int[] num) {
3        int min=num[0];
4        int sum=0;
5        for(int i=0;i<num.length;i++){
6            min=Math.min(min,num[i]);
7        }
8        for(int i=0;i<num.length;i++){
9            sum+=num[i]-min;
10        }
11        return sum;
12    }
13}