// Last updated: 31/07/2026, 11:20:56
1class Solution {
2    public int maxProduct(int[] num) {
3        int n=num.length;
4        int max=num[0];
5        int min=num[0];
6        int res=num[0];
7        for(int i=1;i<n;i++){
8            int current=num[i];
9            int temp=max;
10            max=Math.max(current,Math.max(current*max,current*min));
11            min=Math.min(current,Math.min(current*temp,current*min));
12            res=Math.max(res,max);      
13        }
14        return res;
15        
16    }
17}