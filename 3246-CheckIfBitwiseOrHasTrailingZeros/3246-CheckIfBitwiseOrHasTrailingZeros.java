// Last updated: 14/07/2026, 14:15:57
class Solution {
    public boolean hasTrailingZeros(int[] n) {
        int count=0;
        for(int i=0;i<n.length;i++){
            if((n[i]&1)==0){
                count++;
                if(count>=2){
                    return true;
                }
            }
        }
        return false;
       
    }
}