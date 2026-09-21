// Last updated: 21/09/2026, 15:15:02
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