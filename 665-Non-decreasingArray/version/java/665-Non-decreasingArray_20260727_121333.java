// Last updated: 27/07/2026, 12:13:33
1class Solution {
2    public int findMin(int[] num) {
3        int min=num[0];
4        for(int i=0;i<num.length;i++){
5            if(num[i]<min){
6                min=num[i];
7            }
8        }
9        return min;
10    }
11}