// Last updated: 21/09/2026, 15:15:07
class Solution {
    public int longestSubarray(int[] num) {
        int count=2;
        int ans=2;
        for(int i=2;i<num.length;i++){
            if((long)num[i]==(long)num[i-1]+(long)num[i-2]){
                count++;
            }else{
                count=2;
            }
            ans= Math.max(ans,count);
        }
        return ans;
        
    }
}