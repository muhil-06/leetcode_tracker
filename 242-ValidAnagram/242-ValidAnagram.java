// Last updated: 14/07/2026, 14:17:29
class Solution {
    public boolean isAnagram(String s, String t) {
        int[]res=new int[127];
        for(int i=0;i<s.length();i++){
            res[s.charAt(i)]++;
        }
        for(int i=0;i<t.length();i++){
            res[t.charAt(i)]--;
        }
        for(int i=0;i<127;i++){
            if(res[i]!=0){
                return false;
            }
        }
        return true;
    }
}