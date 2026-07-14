// Last updated: 14/07/2026, 14:18:52
class Solution {
    public int removeDuplicates(int []n) {
        if(n.length==0)
        return 0;
        int k=1;
        for(int i=1;i<n.length;i++){
            if(n[i]!=n[i-1]){
                n[k]=n[i];
                k++;
            }
        }
        return k;
   
    }
}