// Last updated: 01/09/2026, 11:54:12
class Solution {
    public int partitionDisjoint(int[] num) {
        int left=num[0];
        int global=num[0];
        int part=0;
        for(int i=0;i<num.length;i++){
            global=Math.max(num[i],global);
            if(num[i]<left){
                part=i;
                left=global;
            }
        }
        return part+1;
    }
}