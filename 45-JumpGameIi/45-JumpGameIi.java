// Last updated: 14/07/2026, 14:18:34
class Solution {
    public int jump(int[] num) {
        int jump=0;
        int current=0;
        int farthest=0;
        for(int i=0;i<num.length-1;i++){
            farthest=Math.max(farthest,i+num[i]);
            if(i==current){
                jump++;
                current=farthest;
            }
        } 
        return jump;   
    }
}