// Last updated: 14/07/2026, 14:16:11
class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0&&b%i==0)
            count++;
        }
        return count;
    }
}