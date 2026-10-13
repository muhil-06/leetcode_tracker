// Last updated: 13/10/2026, 11:36:48
1class Solution {
2    public String shortestPalindrome(String s) {
3        String rev=new StringBuilder(s).reverse().toString();
4        String temp=s+"#"+rev;
5        int[]lps=new int[temp.length()];
6        for(int i=1;i<temp.length();i++){
7            int j=lps[i-1];
8            while(j>0&&temp.charAt(i)!=temp.charAt(j)){
9                j=lps[j-1];
10            }
11            if(temp.charAt(i)==temp.charAt(j)){
12                j++;
13            }
14            lps[i]=j;
15        }
16        int len=lps[temp.length()-1];
17        return rev.substring(0,s.length()-len)+s;
18    }
19}