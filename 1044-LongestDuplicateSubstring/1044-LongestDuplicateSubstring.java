// Last updated: 21/09/2026, 15:17:38
// class Solution {
//     public String longestDupSubstring(String s) {
//         int n=s.length();
//         int low=1;
//         int high=n-1;
//         String ans="";
//         long base=256;
//         long mod=1000000007;
//         while(low<=high){
//             int len=(low+high)/2;
//             HashSet <Long> set= new HashSet<>();
//             long hash=0;
//             long power=1;
//             for(int i=0;i<len;i++){
//                 hash=(hash * base+s.charAt(i)) % mod;
//                 power=(power*base) % mod;
//             }
//             set.add(hash);
//             int start=-1;
//             for(int i=len;i<n;i++){
//                 hash = (hash * base- s.charAt(i - len) * power + s.charAt(i)) % mod;
//                 if(hash<0){
//                     hash+=mod;
//                 }
//                 if(set.contains(hash)){
//                     start=i-len+1;
//                     break;
//                 }
//                 set.add(hash);
//             }
//             if(start!=-1){
//                 ans=s.substring(start,start+len);
//                 low=len+1;
//             }else{
//                 high=len-1;
//             }
            
//         }
//         return ans;
//     }
// }
class Solution {
    public String longestDupSubstring(String s) {

        int n = s.length();
        int low = 1;
        int high = n - 1;
        String answer = "";

        long base = 911382323L;

        while (low <= high) {

            int len = (low + high) / 2;

            long power = 1;
            long hash = 0;

            for (int i = 0; i < len; i++) {
                hash = hash * base + s.charAt(i);
                power *= base;
            }

            long[] hashes = new long[n - len + 1];
            hashes[0] = hash;

            for (int i = len; i < n; i++) {
                hash = hash * base
                        + s.charAt(i)
                        - s.charAt(i - len) * power;

                hashes[i - len + 1] = hash;
            }

            java.util.HashMap<Long, Integer> map = new java.util.HashMap<>();

            int found = -1;

            for (int i = 0; i < hashes.length; i++) {

                if (map.containsKey(hashes[i])) {

                    int oldStart = map.get(hashes[i]);

                    // Verify to avoid hash collision
                    boolean same = true;

                    for (int j = 0; j < len; j++) {
                        if (s.charAt(oldStart + j) != s.charAt(i + j)) {
                            same = false;
                            break;
                        }
                    }

                    if (same) {
                        found = i;
                        break;
                    }
                }

                map.put(hashes[i], i);
            }

            if (found != -1) {
                answer = s.substring(found, found + len);
                low = len + 1;
            } else {
                high = len - 1;
            }
        }

        return answer;
    }
}