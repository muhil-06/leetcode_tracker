// Last updated: 14/07/2026, 14:18:43
class Solution {
    public int[] searchRange(int[] num, int target) {
        int start=-1;
        int last=-1;
        for(int i=0;i<num.length;i++){
            if(num[i]==target){
                if(start==-1){
                    start=-1;
                    start=i;
                }
                last=i;
            }
        }
        return new int[]{start,last};
    }
}