// Last updated: 14/07/2026, 14:18:29
class Solution {
    public boolean canJump(int[] num) {
        int reach=0;
        for(int i=0;i<num.length;i++){
            if(i>reach){
                return false;
            }
            reach=Math.max(reach,i+num[i]);
        }
        return true;
        
    }
}