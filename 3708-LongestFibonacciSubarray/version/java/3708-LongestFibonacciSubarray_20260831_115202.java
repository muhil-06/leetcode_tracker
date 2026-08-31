// Last updated: 31/08/2026, 11:52:02
1class Solution {
2    public int subarraySum(int[] num, int k) {
3        int count=0;
4        for(int i=0;i<num.length;i++){
5            int sum=0;
6            for(int j=i;j<num.length;j++){
7                sum+=num[j];
8                if(sum==k){
9                count++;
10                }
11            }
12        }
13        return count;
14    }
15}