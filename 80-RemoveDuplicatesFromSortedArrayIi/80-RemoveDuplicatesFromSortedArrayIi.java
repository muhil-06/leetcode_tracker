// Last updated: 14/07/2026, 14:18:19
class Solution {
    public int removeDuplicates(int[] num) {
        if(num.length<=2){
            return num.length;
        }
        int k=2;
        for(int i=2;i<num.length;i++){
            if(num[i]!=num[k-2]){
                num[k]=num[i];
                k++;
            }
        }
        return k;
        
    }
}