// Last updated: 05/08/2026, 15:17:59
class Solution {
    public int numSpecialEquivGroups(String[] words) {
        HashSet<String>set=new HashSet<>();
        for(String word:words){
            String even="";
            String odd="";
            for(int i=0;i<word.length();i++){
                if(i%2==0){
                    even+=word.charAt(i);
                }else{
                    odd+=word.charAt(i);
                }
            }
            char[]e=even.toCharArray();
            char[]o=odd.toCharArray();
            Arrays.sort(e);
            Arrays.sort(o);
            set.add(new String(e)+new String(o));
        }
        return set.size();
    }
}