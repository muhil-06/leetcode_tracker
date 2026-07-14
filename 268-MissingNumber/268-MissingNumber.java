// Last updated: 14/07/2026, 14:17:21
class Solution {
    public int missingNumber(int[] num) {
        int n=num.length;
        int res=n*(n+1)/2;;
        int ans= 0;
        for(int arr:num){
            ans+=arr;
        }
        return res-ans;
    }
}