// Last updated: 14/07/2026, 14:18:59
class Solution {
    public boolean isValid(String s) {
        while(s.contains("()")||s.contains("[]")||s.contains("{}")){
            s=s.replace("()","");
            s=s.replace("[]","");
            s=s.replace("{}","");
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}