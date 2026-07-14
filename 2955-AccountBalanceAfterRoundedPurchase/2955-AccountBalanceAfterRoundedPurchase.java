// Last updated: 14/07/2026, 14:15:49
class Solution {
    public int accountBalanceAfterPurchase(int n) {
        int round=Math.round(n/10.0f)*10;
        int diff=100-round;
        return diff;
        
    }
}