// Last updated: 30/07/2026, 15:59:31
1class Solution {
2    public boolean checkValidString(String s) {
3        int max=0;
4        int min=0;
5        for(int i=0;i<s.length();i++){ 
6            if(s.charAt(i)=='('){
7                min+=1;
8                max+=1;
9            }
10            else if(s.charAt(i)==')'){
11                min-=1;
12                max-=1;
13            }else{
14                min=min-1;
15                max=max+1;
16            }
17            if(min<0){
18                min=0;
19            }
20            if(max<0){
21                return false;
22            }
23        }
24       return min==0;
25    }
26}