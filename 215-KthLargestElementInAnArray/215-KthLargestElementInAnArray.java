// Last updated: 14/07/2026, 14:17:38
class Solution {
    public int findKthLargest(int[] num, int k) {
        Arrays.sort(num);
        return num[num.length-k]; 
    }
}