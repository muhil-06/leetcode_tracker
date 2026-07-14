// Last updated: 14/07/2026, 14:15:53
class Solution {
    public int[] concatWithReverse(int[] num) {
        int[] res=new int[num.length*2];
        for(int i=0;i<num.length;i++){
            res[i]=num[i];
        }
        int j=num.length;
        for(int i=num.length-1;i>=0;i--){
            res[j]=num[i];
            j++;
        }
        return res;
    }
}