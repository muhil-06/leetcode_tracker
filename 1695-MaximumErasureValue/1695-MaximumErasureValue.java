// Last updated: 21/09/2026, 15:16:32
class Solution {
    public int maximumUniqueSubarray(int[] num) {
        int left=0;
        int sum=0;
        int max=0;
        HashSet<Integer>set=new HashSet<>();
        for(int right=0;right<num.length;right++){
            while(set.contains(num[right])){
                set.remove(num[left]);
                sum-=num[left];
                left++;
            }
            set.add(num[right]);
            sum+=num[right];
            max=Math.max(max,sum);
        }
     
          return max;
    }
}