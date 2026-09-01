// Last updated: 01/09/2026, 11:54:24
class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int line=1;
        int current=0;
        for(char c:s.toCharArray()){
            int w=widths[c-'a'];
            if(current+w>100){
                line++;
                current=w;
            }else{
                current+=w;
            }
        }
        return new int[]{line,current};
    }
}