// Last updated: 14/07/2026, 14:17:54
class Solution {
    public String convertToTitle(int n) {
        String res="";
        while(n>0){
            n--;
            res=(char)('A'+(n%26))+res;
            n=n/26;
        }
        return res;
        
    }
}