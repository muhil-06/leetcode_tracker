// Last updated: 30/07/2026, 12:00:28
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        // String t="";
4        // for(int i=0;i<s.length();i++){
5        //     if(s.charAt(i)!='-'){
6        //         t+=Character.toUpperCase(s.charAt(i))+"";
7        //     }
8        // }
9        s=s.replaceAll("-","").toUpperCase();
10        String res="";
11        int c=0;
12        for(int i=s.length()-1;i>=0;i--){
13            if(c==k){
14                res+="-";
15                c=0;
16            }
17            res+=s.charAt(i)+"";
18            c++;
19            
20        }
21        String op="";
22        for(int i=res.length()-1;i>=0;i--){
23            op+=res.charAt(i);
24        }
25        return op;
26    }
27}