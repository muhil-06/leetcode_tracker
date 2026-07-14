// Last updated: 14/07/2026, 14:16:54
class Solution {
    public int countSegments(String s) {
        s=s.trim().replaceAll("\\s+"," ");
        if(s.equals("")){
            return 0;
        }
        return s.split(" ").length;
    }
}