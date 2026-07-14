// Last updated: 14/07/2026, 14:18:40
class Solution {
    public int firstMissingPositive(int[] num) {
        HashSet<Integer>set=new HashSet<>();
        for(int n:num){
            set.add(n);
        } 
        int miss=1;
        while(set.contains(miss)){
            miss++;
        }
        return miss;
    }
}