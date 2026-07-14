// Last updated: 14/07/2026, 14:15:58
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