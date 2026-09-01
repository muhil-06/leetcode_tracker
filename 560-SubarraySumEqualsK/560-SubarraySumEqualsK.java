// Last updated: 01/09/2026, 11:54:50
class Solution {
    public int subarraySum(int[] num, int k) {
        int count=0;
        for(int i=0;i<num.length;i++){
            int sum=0;
            for(int j=i;j<num.length;j++){
                sum+=num[j];
                if(sum==k){
                count++;
                }
            }
        }
        return count;
    }
}