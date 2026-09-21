// Last updated: 21/09/2026, 15:17:45
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