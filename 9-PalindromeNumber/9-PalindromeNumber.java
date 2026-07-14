// Last updated: 14/07/2026, 14:19:20
class Solution {
    public boolean isPalindrome(int n) {
        int temp=n;
        int rev=0;
        if(n<0){
            return false;
        }
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        return temp==rev;
    }
}