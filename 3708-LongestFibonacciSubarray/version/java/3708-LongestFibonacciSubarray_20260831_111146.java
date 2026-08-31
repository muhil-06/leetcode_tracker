// Last updated: 31/08/2026, 11:11:46
1class Solution {
2    public int longestSubarray(int[] num) {
3        int count=2;
4        int ans=2;
5        for(int i=2;i<num.length;i++){
6            if((long)num[i]==(long)num[i-1]+(long)num[i-2]){
7                count++;
8            }else{
9                count=2;
10            }
11            ans= Math.max(ans,count);
12        }
13        return ans;
14        
15    }
16}