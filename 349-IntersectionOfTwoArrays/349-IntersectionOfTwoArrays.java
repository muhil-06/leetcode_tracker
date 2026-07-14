// Last updated: 14/07/2026, 14:16:59
class Solution {
    public int[] intersection(int[] num1, int[] num2) {
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        ArrayList<Integer>res=new ArrayList<>();
        for(int x:num1){
            list1.add(x);
        }
        for(int x:num2){
            list2.add(x);
        }
        for(int i=0;i<list1.size();i++){
            int num=list1.get(i);
            if(list2.contains(num)&&!res.contains(num)){
                res.add(num);
            }
        }
        int []ans=new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;
    }
}