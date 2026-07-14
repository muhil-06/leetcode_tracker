// Last updated: 14/07/2026, 14:19:03
class Solution {
    public List<String> letterCombinations(String digit) {
        List<String>ans=new ArrayList<>();
        if(digit.length()==0){
            return ans;
        }
        String[]map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ans.add("");
        for(int d:digit.toCharArray()){
            List<String>temp=new ArrayList<>();
            String letter=map[d-'0'];
            for(String s:ans){
                for(char c:letter.toCharArray()){
                    temp.add(s+c);
                }
            }
            ans=temp;
        }
        return ans;     
    }
}