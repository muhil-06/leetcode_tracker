// Last updated: 14/07/2026, 14:17:56
class Solution {
    public int[] twoSum(int[] n, int t) {
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
                if(n[i]+n[j]==t){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{};
    }
}