class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int sum=0;
        int t=0,start=0,end=0,k;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(max<sum){
                max=sum;
                start=t;
                end=i;
            }
            if(sum<0){
                sum=0;
                t=i+1;
            }
        }
        for(int i=start;i<=end;i++){
            System.out.println(nums[i]);
        }
        return max;     
    }
}