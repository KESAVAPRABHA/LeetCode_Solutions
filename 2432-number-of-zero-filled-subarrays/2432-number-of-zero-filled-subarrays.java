class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0;
        int n=nums.length,cur=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                cur++;
            }
            else{
                ans+=(1L*cur*(cur+1)/2);
                cur=0;
            }
        }
        ans+=(1L*cur*(cur+1)/2);
        return ans;
    }
}