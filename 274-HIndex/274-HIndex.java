// Last updated: 14/07/2026, 14:17:18
class Solution {
    public int hIndex(int[] c) {
        Arrays.sort(c);
        int n=c.length;
        for(int i=0;i<n;i++){
            int h=n-i;
            if(c[i]>=h){
                return h;
            }
        }
        return 0;
        
    }
}