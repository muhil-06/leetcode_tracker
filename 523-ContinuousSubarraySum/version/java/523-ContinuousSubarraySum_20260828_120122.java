// Last updated: 28/08/2026, 12:01:22
1class Solution {
2    public boolean checkSubarraySum(int[] num, int k) {
3       Map<Integer,Integer>map=new HashMap<>();
4       int sum=0;
5       for(int i=0;i<num.length;i++){
6        sum+=num[i];
7        sum%=k;
8        if(sum==0&&i>0){
9            return true;
10        }
11        if(map.containsKey(sum)&&i-map.get(sum)>1){
12            return true;
13        }
14        if(!map.containsKey(sum)){
15            map.put(sum,i);
16        }
17       }
18       return false;
19    }
20}