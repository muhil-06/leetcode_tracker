// Last updated: 14/07/2026, 14:17:31
class Solution {
    public int[] productExceptSelf(int[] n) {
        int l=n.length;
        int[]ans=new int[l];
        ans[0]=1;
        for(int i=1;i<l;i++){
            ans[i]=ans[i-1]*n[i-1];
        }
        int right=1;
        for(int i=l-1;i>=0;i--){
            ans[i]*=right;
            right*=n[i];
        }
        return ans;
    }
}