// Last updated: 01/09/2026, 11:54:06
class Solution {
    public int subarraysDivByK(int[] num, int k) {
        int[]rem=new int[k];
        rem[0]=1;
        int sum=0;
        int count=0;
        for(int i=0;i<num.length;i++){
            sum+=num[i];
            int r=sum%k;
            if(r<0){
                r+=k;
            }
            count+=rem[r];
            rem[r]++;
        }
        return count;
    }
}