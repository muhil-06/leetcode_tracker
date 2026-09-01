// Last updated: 01/09/2026, 11:41:54
1class Solution {
2    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
3        HashMap<Integer,HashSet<Integer>>map=new HashMap<>();
4        for(int[]log:logs){
5            int u=log[0];
6            int v=log[1];
7            if(!map.containsKey(u)){
8                map.put(u,new HashSet<>());
9                map.get(u).add(v);
10            }else{
11                map.get(u).add(v);
12            }
13        }
14        int[]ans=new int[k];
15        for(int a:map.keySet()){
16            HashSet<Integer>b=map.get(a);
17            ans[b.size()-1]++;
18        }
19        return ans;
20    }
21}