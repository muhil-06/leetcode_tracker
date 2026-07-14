// Last updated: 14/07/2026, 14:18:25
class Solution {
    public int[] plusOne(int[] digit) {
        for(int i=digit.length-1;i>=0;i--){
            if(digit[i]<9){
                digit[i]++;
                return digit;
            }
            digit[i]=0;
        }
        int []result = new int[digit.length+1];
        result[0]=1;
        return result;
    }
}