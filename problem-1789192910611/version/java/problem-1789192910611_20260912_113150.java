// Last updated: 12/09/2026, 11:31:50
1class Solution {
2    public int maximumUniqueSubarray(int[] num) {
3        int left=0;
4        int sum=0;
5        int max=0;
6        HashSet<Integer>set=new HashSet<>();
7        for(int right=0;right<num.length;right++){
8            while(set.contains(num[right])){
9                set.remove(num[left]);
10                sum-=num[left];
11                left++;
12            }
13            set.add(num[right]);
14            sum+=num[right];
15            max=Math.max(max,sum);
16        }
17     
18          return max;
19    }
20}