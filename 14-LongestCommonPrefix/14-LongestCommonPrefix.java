// Last updated: 14/07/2026, 14:19:08
class Solution {
    public String longestCommonPrefix(String[] str) {
        if(str==null||str.length==0){
            return "";
        }
        String prefix=str[0];
        for(int i=0;i<str.length;i++){
            while(str[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
            if(prefix.isEmpty()){
                return "";
            }
        }
        return prefix;
        
    }
}