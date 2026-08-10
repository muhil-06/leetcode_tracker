// Last updated: 10/08/2026, 11:35:55
1class Solution {
2    public int partitionDisjoint(int[] num) {
3        int left=num[0];
4        int global=num[0];
5        int part=0;
6        for(int i=0;i<num.length;i++){
7            global=Math.max(num[i],global);
8            if(num[i]<left){
9                part=i;
10                left=global;
11            }
12        }
13        return part+1;
14    }
15}