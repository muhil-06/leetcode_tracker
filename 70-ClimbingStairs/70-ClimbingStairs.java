// Last updated: 14/07/2026, 14:18:22
class Solution {
    public int climbStairs(int n) {
        int f1=1,f2=2,f3=0;
        if(n==0)
        return 0;
        if(n==1||n==2)
        return n;
        for(int i=3;i<=n;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f3;
    }
}