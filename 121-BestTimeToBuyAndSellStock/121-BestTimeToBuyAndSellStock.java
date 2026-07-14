// Last updated: 14/07/2026, 14:18:11
class Solution {
    public int maxProfit(int[] arr) {
        int min=arr[0];
        int profit=0;
        int val=0;
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            val=arr[i]-min;
            System.out.println(val);
            if(val>profit){
                profit=val;
            }
          
        }
        return profit;
    }
}