// Last updated: 14/07/2026, 14:16:52
class Solution {
    public List<Integer> findDisappearedNumbers(int[] num) {
        HashSet<Integer>list=new HashSet<>();
        for(int n:num){
            list.add(n);
        }
        List<Integer>res=new ArrayList<>();
        for(int i=1;i<=num.length;i++){
            if(!list.contains(i)){
                res.add(i);
            }
        }
        return res;
        
    }
}