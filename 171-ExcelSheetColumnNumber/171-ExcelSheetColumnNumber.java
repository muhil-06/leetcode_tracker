// Last updated: 14/07/2026, 14:17:51
class Solution {
    public int titleToNumber(String col) {
        int res=0;
        for(int i=0;i<col.length();i++){
            res=res*26+(col.charAt(i)-'A'+1);
        }
        return res;
        
    }
}