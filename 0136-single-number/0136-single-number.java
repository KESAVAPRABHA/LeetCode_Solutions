class Solution {
    public int singleNumber(int[] nums) {
        int z=nums[0];
        for(int i=1;i<nums.length;i++){
            z=z^nums[i];
        }
        return z;
    }
}