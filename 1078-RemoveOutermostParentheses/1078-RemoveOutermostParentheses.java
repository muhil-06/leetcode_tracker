// Last updated: 14/07/2026, 14:16:37
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result=new StringBuilder();
        int depth=0;
       for(char ch:s.toCharArray()){
        if(ch=='('){
            if(depth>0){
                result.append(ch);
            }
            depth++;
        }else{
            depth--;
            if(depth>0){
                result.append(ch);
            }
        }
     }
        return result.toString();
    }
}