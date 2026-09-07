// Last updated: 07/09/2026, 11:52:05
1class Solution {
2    public int maximumSum(int[] nums) {
3        int[]max=new int[100];
4        int ans=-1;
5        for(int num:nums){
6            int sum=0;
7            int temp=num;
8            while(temp>0){
9                int d=temp%10;
10                sum+=d;
11                temp/=10;
12            }
13            if(max[sum]!=0){
14                ans=Math.max(ans,num+max[sum]);
15            }
16            max[sum]=Math.max(max[sum],num);
17        }
18        return ans;
19    }
20}