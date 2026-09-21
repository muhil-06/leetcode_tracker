// Last updated: 21/09/2026, 15:15:04
class Solution {
    public int accountBalanceAfterPurchase(int n) {
        int round=Math.round(n/10.0f)*10;
        int diff=100-round;
        return diff;
        
    }
}