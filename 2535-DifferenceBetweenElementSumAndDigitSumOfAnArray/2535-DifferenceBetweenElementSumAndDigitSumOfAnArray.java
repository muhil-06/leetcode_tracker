// Last updated: 21/09/2026, 15:15:27
class Solution {
    public int differenceOfSum(int[] n) {
        int esum=0;
        int dsum=0;
        for(int i=0;i<n.length;i++){
            esum+=n[i];
            dsum+=sumOfDigits(n[i]);
        }
        return esum-dsum;
    }
        private int sumOfDigits(int n){
            int sum=0;
            while(n!=0){
                sum+=n%10;
                n=n/10;
            }
            return sum;
        }  
}