// Last updated: 21/09/2026, 15:16:14
class Solution {
    public boolean isThree(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        return count==3;
    
    }
}