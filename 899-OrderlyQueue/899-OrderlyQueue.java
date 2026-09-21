// Last updated: 21/09/2026, 15:18:18
class Solution {
    public String orderlyQueue(String s, int k) {
        if(k==1){
            String ans=s;
            for(int i=1;i<s.length();i++){
                String r=s.substring(i)+s.substring(0,i);
                if(r.compareTo(ans)<0){
                  ans=r;
                }
            }
            return ans;
        }
        char[]arr=s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
        
    }
}