// Last updated: 14/07/2026, 14:19:05
class Solution {
    public int threeSumClosest(int[] num, int t) {
        Arrays.sort(num);
        int close=num[0]+num[1]+num[2];
        for(int i=0;i<num.length-2;i++){
            int left=i+1;
            int right=num.length-1;
            while(left<right){
                int sum=num[i]+num[left]+num[right];
                if(Math.abs(t-sum)<Math.abs(t-close)){
                    close=sum;
                }
                if(sum<t){
                    left++;
                }else if(sum>t){
                    right--;
                }else{
                    return sum;
                }
            }
        }
        return close;
        
    }
}