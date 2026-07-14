// Last updated: 14/07/2026, 14:19:34
class Solution {
    public int[] twoSum(int[] arr, int k) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    return new int []{i,j};
                }
            }
        }
        return new int []{};
    }
}