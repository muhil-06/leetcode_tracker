// Last updated: 21/09/2026, 15:18:02
class Solution {
    public int fib(int n) {
        int f1=-1,f2=1;
        int f3=0;
        for(int i=0;i<=n;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f3;

    }
}