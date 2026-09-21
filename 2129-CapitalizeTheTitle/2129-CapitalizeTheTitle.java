// Last updated: 21/09/2026, 15:16:12
class Solution {
    public String capitalizeTitle(String s) {
        String[]word=s.split(" ");
        String res="";
        for(int i=0;i<word.length;i++){
            String w=word[i].toLowerCase();
            if(w.length()<=2){
                res+=w;
            }else{
                res+=Character.toUpperCase(w.charAt(0))+w.substring(1);
            }
            if(i!=word.length-1){
                res+=" ";
            }
        }
        return res;
    }
}