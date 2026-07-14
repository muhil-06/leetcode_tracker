// Last updated: 14/07/2026, 14:19:26
class Solution {
    public String convert(String s, int num) {
        if(num==1||num>s.length()){
            return s;
        }
        ArrayList<StringBuilder>rows=new ArrayList<>();
        for(int i=0;i<num;i++){
            rows.add(new StringBuilder());
        }
        int current=0;
        boolean move=false;
        for(char ch:s.toCharArray()){
            rows.get(current).append(ch);
            if(current==0||current==num-1){
                move=!move;
            }
            if(move){
                current++;
            }else{
                current--;
            }
        }
        StringBuilder res=new StringBuilder();
        for(StringBuilder row:rows){
            res.append(row);
        }
        return res.toString();
    }
}