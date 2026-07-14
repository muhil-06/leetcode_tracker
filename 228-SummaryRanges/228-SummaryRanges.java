// Last updated: 14/07/2026, 14:17:34
class Solution {
    public List<String> summaryRanges(int[] num) {
        List<String>res=new ArrayList<>();
        if(num.length==0){
            return res;
        }
        int start=num[0];
        for(int i=1;i<=num.length;i++){
            if(i==num.length||num[i]!=num[i-1]+1){
                int end=num[i-1];
                if(start==end){
                    res.add(String.valueOf(start));
                }else{
                    res.add(start+"->"+end);
                }
                if(i<num.length){
                    start=num[i];
                }
            }
        }
        return res;
    }
}