// Last updated: 05/08/2026, 15:18:19
class Solution {
    public boolean checkPossibility(int[] num) {
        int count=0;
        for(int i=0;i<num.length-1;i++){
            if(num[i]>num[i+1]){
                count++;
                if(count>1){
                    return false;
                }
                if (i==0||num[i-1]<=num[i+1]){
                    num[i]=num[i+1];
                }else{
                    num[i+1]=num[i];
                }    
            }
        }  
        return true;
    }
}