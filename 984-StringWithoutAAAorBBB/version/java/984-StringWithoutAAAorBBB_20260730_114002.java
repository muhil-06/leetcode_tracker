// Last updated: 30/07/2026, 11:40:02
1class Solution {
2    public String strWithout3a3b(int a, int b) {
3        String sb="";
4        while(a>0||b>0){
5            if(sb.endsWith("aa")){
6                sb+="b";
7                b--;
8            }
9            else if(sb.endsWith("bb")){
10                sb+="a";
11                a--;
12            }
13            else if(a>b){
14                sb+="a";
15                a--;
16            }
17            else{
18                sb+="b";
19                b--;
20            }
21        }
22        return sb;
23        
24    }
25}