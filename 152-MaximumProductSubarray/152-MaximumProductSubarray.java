// Last updated: 01/09/2026, 11:56:32
class Solution {
    public int maxProduct(int[] num) {
        int n=num.length;
        int max=num[0];
        int min=num[0];
        int res=num[0];
        for(int i=1;i<n;i++){
            int current=num[i];
            int temp=max;
            max=Math.max(current,Math.max(current*max,current*min));
            min=Math.min(current,Math.min(current*temp,current*min));
            res=Math.max(res,max);      
        }
        return res;
        
    }
}