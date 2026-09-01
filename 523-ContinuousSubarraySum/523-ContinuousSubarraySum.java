// Last updated: 01/09/2026, 11:54:53
class Solution {
    public boolean checkSubarraySum(int[] num, int k) {
       Map<Integer,Integer>map=new HashMap<>();
       int sum=0;
       for(int i=0;i<num.length;i++){
        sum+=num[i];
        sum%=k;
        if(sum==0&&i>0){
            return true;
        }
        if(map.containsKey(sum)&&i-map.get(sum)>1){
            return true;
        }
        if(!map.containsKey(sum)){
            map.put(sum,i);
        }
       }
       return false;
    }
}