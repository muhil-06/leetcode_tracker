// Last updated: 05/08/2026, 15:18:31
class Solution {
    public int minMoves(int[] num) {
        int min=num[0];
        int sum=0;
        for(int i=0;i<num.length;i++){
            min=Math.min(min,num[i]);
        }
        for(int i=0;i<num.length;i++){
            sum+=num[i]-min;
        }
        return sum;
    }
}