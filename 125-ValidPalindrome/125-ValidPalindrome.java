// Last updated: 14/07/2026, 14:18:07
class Solution {
    public boolean isPalindrome(String s) {
        String res="";
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        if(res.equals(s)){
            return true;
        }
        return false;
    }
}