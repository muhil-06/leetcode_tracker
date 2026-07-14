// Last updated: 14/07/2026, 14:16:55
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}