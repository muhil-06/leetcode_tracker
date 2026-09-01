// Last updated: 01/09/2026, 11:53:26
class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer,HashSet<Integer>>map=new HashMap<>();
        for(int[]log:logs){
            int u=log[0];
            int v=log[1];
            if(!map.containsKey(u)){
                map.put(u,new HashSet<>());
                map.get(u).add(v);
            }else{
                map.get(u).add(v);
            }
        }
        int[]ans=new int[k];
        for(int a:map.keySet()){
            HashSet<Integer>b=map.get(a);
            ans[b.size()-1]++;
        }
        return ans;
    }
}