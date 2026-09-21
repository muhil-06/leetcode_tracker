// Last updated: 21/09/2026, 15:15:41
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