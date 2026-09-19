// Last updated: 19/09/2026, 11:28:52
1// class Solution {
2//     public String longestDupSubstring(String s) {
3//         int n=s.length();
4//         int low=1;
5//         int high=n-1;
6//         String ans="";
7//         long base=256;
8//         long mod=1000000007;
9//         while(low<=high){
10//             int len=(low+high)/2;
11//             HashSet <Long> set= new HashSet<>();
12//             long hash=0;
13//             long power=1;
14//             for(int i=0;i<len;i++){
15//                 hash=(hash * base+s.charAt(i)) % mod;
16//                 power=(power*base) % mod;
17//             }
18//             set.add(hash);
19//             int start=-1;
20//             for(int i=len;i<n;i++){
21//                 hash = (hash * base- s.charAt(i - len) * power + s.charAt(i)) % mod;
22//                 if(hash<0){
23//                     hash+=mod;
24//                 }
25//                 if(set.contains(hash)){
26//                     start=i-len+1;
27//                     break;
28//                 }
29//                 set.add(hash);
30//             }
31//             if(start!=-1){
32//                 ans=s.substring(start,start+len);
33//                 low=len+1;
34//             }else{
35//                 high=len-1;
36//             }
37            
38//         }
39//         return ans;
40//     }
41// }
42class Solution {
43    public String longestDupSubstring(String s) {
44
45        int n = s.length();
46        int low = 1;
47        int high = n - 1;
48        String answer = "";
49
50        long base = 911382323L;
51
52        while (low <= high) {
53
54            int len = (low + high) / 2;
55
56            long power = 1;
57            long hash = 0;
58
59            for (int i = 0; i < len; i++) {
60                hash = hash * base + s.charAt(i);
61                power *= base;
62            }
63
64            long[] hashes = new long[n - len + 1];
65            hashes[0] = hash;
66
67            for (int i = len; i < n; i++) {
68                hash = hash * base
69                        + s.charAt(i)
70                        - s.charAt(i - len) * power;
71
72                hashes[i - len + 1] = hash;
73            }
74
75            java.util.HashMap<Long, Integer> map = new java.util.HashMap<>();
76
77            int found = -1;
78
79            for (int i = 0; i < hashes.length; i++) {
80
81                if (map.containsKey(hashes[i])) {
82
83                    int oldStart = map.get(hashes[i]);
84
85                    // Verify to avoid hash collision
86                    boolean same = true;
87
88                    for (int j = 0; j < len; j++) {
89                        if (s.charAt(oldStart + j) != s.charAt(i + j)) {
90                            same = false;
91                            break;
92                        }
93                    }
94
95                    if (same) {
96                        found = i;
97                        break;
98                    }
99                }
100
101                map.put(hashes[i], i);
102            }
103
104            if (found != -1) {
105                answer = s.substring(found, found + len);
106                low = len + 1;
107            } else {
108                high = len - 1;
109            }
110        }
111
112        return answer;
113    }
114}