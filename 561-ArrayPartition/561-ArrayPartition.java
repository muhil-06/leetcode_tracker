// Last updated: 14/07/2026, 14:16:48
class Solution {
    public int arrayPairSum(int[] num) {
        Arrays.sort(num);
        int sum=0;
        for(int i=0;i<num.length;i+=2){
            sum+=num[i];
        } 
        return sum;
    }
}