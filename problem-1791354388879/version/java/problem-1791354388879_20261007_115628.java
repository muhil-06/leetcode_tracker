// Last updated: 07/10/2026, 11:56:28
1class Solution {
2    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
3        char[]c1=s1.toCharArray();
4        char[]c2=s2.toCharArray();
5        int i=0,j=0,count2=0;
6        while(n1>0){
7            if(c1[i]==c2[j]){
8                if(++j==c2.length){
9                    j=0;
10                    count2++;
11                }
12            }
13            if(++i==c1.length){
14                i=0;
15                n1--;
16            }         
17        }
18        return count2/n2;
19    }
20}