// Last updated: 14/07/2026, 14:19:24
class Solution {
    public int reverse(int n) {
        long rev=0;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
            if(rev<Integer.MIN_VALUE||Integer.MAX_VALUE<rev){
                return 0; 
            }
        }
        return (int)rev;
    }
}