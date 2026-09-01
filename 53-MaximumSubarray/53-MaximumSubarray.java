// Last updated: 01/09/2026, 11:57:43
class Solution {
    public int maxSubArray(int[] num) {
        int n=num.length;
        int current=num[0];
        int max=num[0];
        for(int i=1;i<n;i++){
            current=Math.max(num[i],current+num[i]);
            max=Math.max(current,max);         
        }
        return max;
    }
}