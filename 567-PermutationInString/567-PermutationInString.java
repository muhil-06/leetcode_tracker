// Last updated: 01/09/2026, 11:54:45
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m)
        return false;
        int[]s1count=new int[26];
        int[]window=new int[26];
        for(int i=0;i<n;i++){
            s1count[s1.charAt(i)-'a']++;
            window[s2.charAt(i)-'a']++;
        }
        if(matches(s1count,window)) return true;
        for(int i=n;i<m;i++){
            window[s2.charAt(i)-'a']++;
            window[s2.charAt(i-n)-'a']--;
            if(matches(s1count,window)) return true;
        }
        return false;
    }
    private boolean matches(int[]a,int[]b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}