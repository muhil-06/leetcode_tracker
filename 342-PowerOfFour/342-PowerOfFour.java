// Last updated: 14/07/2026, 14:17:04
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0){
            return true;
        }else{
            return false;
        }
    }
}