// Last updated: 14/07/2026, 14:16:50
class Solution {
    public int hammingDistance(int x, int y) {
        int sum=0;
        int n=x^y;
        while(n>0){
            sum+=n&1;
            n=n>>1;
        }
        return sum;
      
    }
}