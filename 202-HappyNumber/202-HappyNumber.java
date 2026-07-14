// Last updated: 14/07/2026, 14:17:42
class Solution {
    int add(int a){
        int sum=0;
        while(a!=0){
            sum=sum+(a%10)*(a%10);
            a=a/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        while(n>9){
            n=add(n);
        }
        if(n==1||n==7){
            return true;
        }
        else{
            return false;
        }
       
    }
}