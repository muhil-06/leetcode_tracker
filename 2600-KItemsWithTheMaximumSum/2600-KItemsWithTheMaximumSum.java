// Last updated: 21/09/2026, 15:15:23
class Solution {
    public int kItemsWithMaximumSum(int nO, int nZ, int nN, int k) {
        int op=Math.min(k,nO);
        k-=op;
        int zp=Math.min(k,nZ);
        k-=zp;
        int np=k;
        return op-np;
    }
    
}