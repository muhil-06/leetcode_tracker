// Last updated: 14/07/2026, 14:17:40
class Solution {
    public int minSubArrayLen(int t, int[] num) {
        int left=0;
        int sum=0;
        int minlen=Integer.MAX_VALUE;
        for(int right=0;right<num.length;right++){
            sum+=num[right];
            while(sum>=t){
                minlen=Math.min(minlen,right-left+1);
                sum-=num[left];
                left++;
            } 
        }
        return minlen== Integer.MAX_VALUE?0:minlen;      
    }
}