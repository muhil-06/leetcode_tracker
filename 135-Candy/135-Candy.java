// Last updated: 14/07/2026, 14:18:02
class Solution {
    public int candy(int[] rate) {
        int n=rate.length;
        int[]candies=new int[n];
        for(int i=0;i<n;i++){
            candies[i]=1;
        }
        for(int i=1;i<n;i++){
            if(rate[i]>rate[i-1]){
                candies[i]=candies[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(rate[i]>rate[i+1]){
                candies[i]=Math.max(candies[i],candies[i+1]+1);
            }
        }
        int total=0;
        for(int candy:candies){
            total+=candy;
        }
        return total;
    }
}