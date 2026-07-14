// Last updated: 14/07/2026, 14:16:09
class Solution {
    public int averageValue(int[] n) {
        int count=0;
        int sum=0;
        for(int i=0;i<n.length;i++){
            if(n[i]%2==0&&n[i]%3==0){
                count++;
                sum=sum+n[i];
            }
            
        }
        if(count==0)return 0;
        else return sum/count;
        
    }
}