// Last updated: 14/07/2026, 14:17:49
class Solution {
    public int trailingZeroes(int n) {
        int sum=0;
        int count=0;
        if(n<=4)
        return 0;
        for(int i=5;i<=n;i*=5){
            count+=n/i;

        } 
        return count;
    }
}