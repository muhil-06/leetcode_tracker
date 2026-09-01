// Last updated: 01/09/2026, 11:55:16
class Solution {
    public boolean isValidSerialization(String preorder) {
        String[]node=preorder.split(",");
        int slot=1;
        for(String n:node){
            slot--;
            if(slot<0){
               return false;
            }
            if(!n.equals("#")){
               slot+=2;
            }
        }
        return slot==0;
    }
}