// Last updated: 21/09/2026, 15:13:35
1class Solution {
2    public int firstMissingPositive(int[] num) {
3        HashSet<Integer>set=new HashSet<>();
4        for(int n:num){
5            set.add(n);
6        } 
7        int miss=1;
8        while(set.contains(miss)){
9            miss++;
10        }
11        return miss;
12    }
13}