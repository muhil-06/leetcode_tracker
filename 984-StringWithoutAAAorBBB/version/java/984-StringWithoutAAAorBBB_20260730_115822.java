// Last updated: 30/07/2026, 11:58:22
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        String t="";
4        for(int i=0;i<s.length();i++){
5            if(s.charAt(i)!='-'){
6                t+=Character.toUpperCase(s.charAt(i))+"";
7            }
8        }
9        String res="";
10        int c=0;
11        for(int i=t.length()-1;i>=0;i--){
12            if(c==k){
13                res+="-";
14                c=0;
15            }
16            res+=t.charAt(i)+"";
17            c++;
18            
19        }
20        String op="";
21        for(int i=res.length()-1;i>=0;i--){
22            op+=res.charAt(i);
23        }
24        return op;
25    }
26}