// Last updated: 21/09/2026, 15:18:07
class Solution {
    public int minFlipsMonoIncr(String s) {
        int one=0;
        int flip=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                one++;
            }else{
                flip=Math.min(flip+1,one);
            }
        }
        return flip;
    }
}