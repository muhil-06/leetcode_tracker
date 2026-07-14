// Last updated: 14/07/2026, 14:18:50
class Solution {
    public int removeElement(int[] n, int val) {
        int count=0;
        for(int i=0;i<n.length;i++){
            if(val!=n[i]){
                n[count]=n[i];
                count++;
            }
        }
        return count;
    }
}