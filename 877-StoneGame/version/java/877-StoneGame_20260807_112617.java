// Last updated: 07/08/2026, 11:26:17
1class Solution {
2    public boolean circularArrayLoop(int[] num) {
3        int n=num.length;
4        for(int i=0;i<n;i++){
5            Set<Integer>set=new HashSet<>();
6            int curr=i;
7            boolean forward=num[i]>0;
8            while(true){
9                if((num[curr]>0)!=forward)
10                break;
11                if(set.contains(curr))
12                return true;
13                set.add(curr);
14                int next=((curr+num[curr])%n+n)%n;
15                if(next==curr)
16                break;
17                curr=next;
18            }
19        }
20        return false;
21        
22    }
23}