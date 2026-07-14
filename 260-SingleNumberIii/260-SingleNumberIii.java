// Last updated: 14/07/2026, 14:17:25
class Solution {
    public int[] singleNumber(int[] num) {
        int[]res=new int[2];
        int index=0;
        for(int i=0;i<num.length;i++){
            int count=0;
            for(int j=0;j<num.length;j++){
                if(num[i]==num[j]){
                    count++;
                }
            }
            if(count==1){
                res[index]=num[i];
                index++;
            }
        }
        return res;
    }
}