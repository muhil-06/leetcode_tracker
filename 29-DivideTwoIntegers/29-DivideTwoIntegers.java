// Last updated: 14/07/2026, 14:18:47
class Solution {
    public int divide(int div, int d) {
        if (div == -2147483648 && d == -1){
            return 2147483647;
        }
       int res=div/d;
       return res; 
    }
}