// Last updated: 31/08/2026, 11:43:41
1class Solution {
2    public int subarraysDivByK(int[] num, int k) {
3        int[]rem=new int[k];
4        rem[0]=1;
5        int sum=0;
6        int count=0;
7        for(int i=0;i<num.length;i++){
8            sum+=num[i];
9            int r=sum%k;
10            if(r<0){
11                r+=k;
12            }
13            count+=rem[r];
14            rem[r]++;
15        }
16        return count;
17    }
18}