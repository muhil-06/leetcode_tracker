// Last updated: 01/09/2026, 11:55:01
class Solution {
    public boolean circularArrayLoop(int[] num) {
        int n=num.length;
        for(int i=0;i<n;i++){
            Set<Integer>set=new HashSet<>();
            int curr=i;
            boolean forward=num[i]>0;
            while(true){
                if((num[curr]>0)!=forward)
                break;
                if(set.contains(curr))
                return true;
                set.add(curr);
                int next=((curr+num[curr])%n+n)%n;
                if(next==curr)
                break;
                curr=next;
            }
        }
        return false;
        
    }
}