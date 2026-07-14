// Last updated: 14/07/2026, 14:16:26
class Solution {
    public int numWaterBottles(int n, int m) {
        int result=n;
        while(n>=m){
            result+=n/m;
            n=n/m+n%m;
        }
        return result;
    }
}