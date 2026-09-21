// Last updated: 21/09/2026, 15:15:21
class Solution {
    public int findDelayedArrivalTime(int n1, int n2) {
        if(n1+n2==24)
        return 0;
        if(n1+n2>24)
        return (n1+n2)%24;
        else
        return n1+n2;
    }
}