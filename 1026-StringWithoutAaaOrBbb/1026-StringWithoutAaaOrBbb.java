// Last updated: 05/08/2026, 15:17:44
class Solution {
    public String strWithout3a3b(int a, int b) {
        String sb="";
        while(a>0||b>0){
            if(sb.endsWith("aa")){
                sb+="b";
                b--;
            }
            else if(sb.endsWith("bb")){
                sb+="a";
                a--;
            }
            else if(a>b){
                sb+="a";
                a--;
            }
            else{
                sb+="b";
                b--;
            }
        }
        return sb;
        
    }
}