// Last updated: 14/07/2026, 14:19:22
class Solution {
    public int myAtoi(String s) {
        int i=0,sign=1;
        long res=0;
        while(i<s.length()&&s.charAt(i)==' '){
            i++;
        }
        if(i<s.length()&&(s.charAt(i)=='+'||s.charAt(i)=='-')){
            if(s.charAt(i)=='-'){
                sign=-1;
            }
            i++;
        }
        while(i<s.length()&&Character.isDigit(s.charAt(i))){
            res=res*10+(s.charAt(i)-'0');
            if(sign==1&&res>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign==-1&&-res<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)(sign*res);
        
    }
}