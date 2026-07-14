// Last updated: 14/07/2026, 14:16:31
class Solution {
    public int subtractProductAndSum(int n) {
        int rev=0;
        int last;
        int mul=1;
        int sum=0;
        while(n!=0){
            last=n%10;
            mul=mul*last;
            sum=sum+last;
            n=n/10;
        }
        return mul-sum;
    }
}