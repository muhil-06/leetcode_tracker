// Last updated: 14/07/2026, 14:18:00
class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int num:nums){
            res^=num;
        }
        return res;
    }
}