// Last updated: 14/07/2026, 14:19:07
class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>>res=new ArrayList<>();
        Arrays.sort(num);
        for(int i=0;i<num.length-2;i++){
            if(i>0&&num[i]==num[i-1]){
                continue;
            }
            int left=i+1;
            int right=num.length-1;
            while(left<right){
                int sum=num[i]+num[left]+num[right];
                if(sum==0){
                    res.add(Arrays.asList(num[i],num[left],num[right]));
                    while(left<right&&num[left]==num[left+1]){
                        left++;
                    }
                    while(left<right&&num[right]==num[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return res;

        
    }
}