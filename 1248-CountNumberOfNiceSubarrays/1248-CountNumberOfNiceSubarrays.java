// Last updated: 21/09/2026, 15:17:14
class Solution {
    public int numberOfSubarrays(int[] num, int k) {
        int c=0,odd=0,j=0,temp=0;
        for(int i=0;i<num.length;i++){
            if(num[i]%2!=0){
                odd++;
                temp=0;
            }
            while(odd==k){
                temp++;
                if(num[j]%2!=0){
                   odd--;
                }
                j++;
            }
            c+=temp;
        }
        return c;

    }
}