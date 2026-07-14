// Last updated: 14/07/2026, 14:17:06
class Solution {
    public int minPatches(int[] num, int n) {
        long m=1;
        int i=0;
        int p=0;
        while(m<=n){
            if(i<num.length&&num[i]<=m){
                m+=num[i];
                i++;
            }else{
                m+=m;
                p++;
            }
        }
        return p;
        
    }
}