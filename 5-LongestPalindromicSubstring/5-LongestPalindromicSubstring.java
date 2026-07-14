// Last updated: 14/07/2026, 14:19:27
class Solution {
    public String longestPalindrome(String s) {
        String longest="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub=s.substring(i,j);
                int left=0;
                int right=sub.length()-1;
                boolean palindrome=true;
                while(left<right){
                    if(sub.charAt(left)!=sub.charAt(right)){
                        palindrome=false;
                        break;
                    }
                    left++;
                    right--;
                }
                if(palindrome&&sub.length()>longest.length()){
                    longest=sub;
                }
            }
        }
        return longest;
    }
}