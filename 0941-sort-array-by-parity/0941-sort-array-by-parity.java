class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=0;
        int n[]=new int[nums.length];
        for(i=0,j=0;i<nums.length;i++){ 
            if (nums[i]%2==0){
                    n[j]=nums[i];
                    j++;
            }
        }
        for(i=0;i<nums.length;i++){ 
            if (nums[i]%2!=0){
                    n[j]=nums[i];
                    j++;
            }
        }
    return n;
    }
}