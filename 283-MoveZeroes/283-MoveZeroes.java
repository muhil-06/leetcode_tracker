// Last updated: 14/07/2026, 14:17:16
class Solution {
    public void moveZeroes(int[] num) {
        int j=0;
        for(int i=0;i<num.length;i++){
            if( num[i]!=0){
                int temp=num[i];
                num[i]=num[j];
                num[j]=temp;
                j++;
            }
        }
       
    }
}