// Last updated: 14/07/2026, 14:16:40
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