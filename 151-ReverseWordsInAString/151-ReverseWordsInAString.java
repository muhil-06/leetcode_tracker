// Last updated: 14/07/2026, 14:17:58
class Solution {
    public String reverseWords(String s) {
        String[]word=s.trim().split("\\s+");
        String res="";
        for(int i=word.length-1;i>=0;i--){
            res+=word[i];
            if(i!=0){
                res+=" ";
            }
        }
        return res;
    }
}