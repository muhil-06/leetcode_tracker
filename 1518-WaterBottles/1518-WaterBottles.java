// Last updated: 21/09/2026, 15:16:53
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