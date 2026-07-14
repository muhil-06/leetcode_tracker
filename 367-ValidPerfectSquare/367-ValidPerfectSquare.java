// Last updated: 14/07/2026, 14:16:57
class Solution {
    public boolean isPerfectSquare(int n) {
        double sqrt=Math.sqrt(n);
        if(sqrt==Math.floor(sqrt))
        return true;
        else
        return false;
    }
}