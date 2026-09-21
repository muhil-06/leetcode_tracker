// Last updated: 21/09/2026, 15:15:54
class Solution {
    public int maximumSum(int[] nums) {
        int[]max=new int[100];
        int ans=-1;
        for(int num:nums){
            int sum=0;
            int temp=num;
            while(temp>0){
                int d=temp%10;
                sum+=d;
                temp/=10;
            }
            if(max[sum]!=0){
                ans=Math.max(ans,num+max[sum]);
            }
            max[sum]=Math.max(max[sum],num);
        }
        return ans;
    }
}