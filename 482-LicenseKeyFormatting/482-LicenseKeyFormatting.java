// Last updated: 05/08/2026, 15:18:24
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        // String t="";
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)!='-'){
        //         t+=Character.toUpperCase(s.charAt(i))+"";
        //     }
        // }
        s=s.replaceAll("-","").toUpperCase();
        String res="";
        int c=0;
        for(int i=s.length()-1;i>=0;i--){
            if(c==k){
                res+="-";
                c=0;
            }
            res+=s.charAt(i)+"";
            c++;
            
        }
        String op="";
        for(int i=res.length()-1;i>=0;i--){
            op+=res.charAt(i);
        }
        return op;
    }
}