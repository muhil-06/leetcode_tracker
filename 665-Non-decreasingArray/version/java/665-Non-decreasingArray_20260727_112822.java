// Last updated: 27/07/2026, 11:28:22
1class Solution {
2    public boolean checkPossibility(int[] num) {
3        int count=0;
4        for(int i=0;i<num.length-1;i++){
5            if(num[i]>num[i+1]){
6                count++;
7                if(count>1){
8                    return false;
9                }
10                if (i==0||num[i-1]<=num[i+1]){
11                    num[i]=num[i+1];
12                }else{
13                    num[i+1]=num[i];
14                }    
15            }
16        }  
17        return true;
18    }
19}