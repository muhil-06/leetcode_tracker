// Last updated: 14/07/2026, 14:17:47
class Solution {
    public void rotate(int[] num, int k) {
        int n=num.length;
        k=k%n;
        int start=0,end=n-1;
        while(start<end){
            int temp=num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;
        }
        start=0;end=k-1;
        while(start<end){
            int temp=num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;
        }
        start=k;end=n-1;
        while(start<end){
            int temp=num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;
        }
    }
}