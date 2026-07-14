// Last updated: 14/07/2026, 14:18:17
class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
        for(int i=0;i<n;i++){
            num1[m+i]=num2[i];
        }
        Arrays.sort(num1);
    }
}