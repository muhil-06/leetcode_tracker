// Last updated: 30/07/2026, 16:20:07
1class Solution {
2    public int maxSubArray(int[] num) {
3        int n=num.length;
4        int current=num[0];
5        int max=num[0];
6        for(int i=1;i<n;i++){
7            current=Math.max(num[i],current+num[i]);
8            max=Math.max(current,max);         
9        }
10        return max;
11    }
12}