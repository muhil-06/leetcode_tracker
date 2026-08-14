// Last updated: 14/08/2026, 11:47:47
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        int n=s1.length();
4        int m=s2.length();
5        if(n>m)
6        return false;
7        int[]s1count=new int[26];
8        int[]window=new int[26];
9        for(int i=0;i<n;i++){
10            s1count[s1.charAt(i)-'a']++;
11            window[s2.charAt(i)-'a']++;
12        }
13        if(matches(s1count,window)) return true;
14        for(int i=n;i<m;i++){
15            window[s2.charAt(i)-'a']++;
16            window[s2.charAt(i-n)-'a']--;
17            if(matches(s1count,window)) return true;
18        }
19        return false;
20    }
21    private boolean matches(int[]a,int[]b){
22        for(int i=0;i<26;i++){
23            if(a[i]!=b[i]){
24                return false;
25            }
26        }
27        return true;
28    }
29}