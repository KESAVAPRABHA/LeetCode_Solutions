class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        int k=0;
        for(int i:nums){
            if(i!=0){
                nums[k]=i;
                k++;
            }
            else{
                count++;
            }
        }
        for(int i=k;i<nums.length;i++){
            nums[i]=0;
        }
        System.out.println(Arrays.toString(nums));
    }
}