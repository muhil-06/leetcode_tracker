// Last updated: 14/07/2026, 14:17:53
class Solution {
    public int majorityElement(int[] num) {
        Arrays.sort(num);
        return num[num.length/2];
    }
}