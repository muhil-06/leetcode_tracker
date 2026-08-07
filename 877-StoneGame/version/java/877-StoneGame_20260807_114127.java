// Last updated: 07/08/2026, 11:41:27
1class Solution {
2    public boolean isValidSerialization(String preorder) {
3        String[]node=preorder.split(",");
4        int slot=1;
5        for(String n:node){
6            slot--;
7            if(slot<0){
8               return false;
9            }
10            if(!n.equals("#")){
11               slot+=2;
12            }
13        }
14        return slot==0;
15    }
16}