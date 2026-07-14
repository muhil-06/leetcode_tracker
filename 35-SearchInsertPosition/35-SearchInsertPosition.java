// Last updated: 14/07/2026, 14:18:42
class Solution {
    public int searchInsert(int[] num, int t) {
        int i=0;
        while(i<num.length&&num[i]<t){
            i++;
        }
        return i;   
    }
}