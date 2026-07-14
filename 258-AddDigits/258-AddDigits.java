// Last updated: 14/07/2026, 14:17:26
class Solution {
    public int addDigits(int n) {
        if(n==0)
        return 0;
        if(n%9==0)
        return 9;
        else
        return n%9;
    }
}