// Last updated: 21/09/2026, 15:15:36
class Solution {
    public int numberOfCuts(int n) {
        if(n==1)
        return 0;
        if(n%2==0)
        return n/2; 
        else
        return n;
        
    } 
}