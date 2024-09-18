class Solution {
    public void swap(int []nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        // Arrays.sort(nums);
        int temp=0;
        int m=0;
        int l=0;
        int h=nums.length-1;
        int i=0;
          while (m <= h) {
            if (nums[m] == 0) {
                swap(nums, m, l);
                l++;
                m++;
            } else if (nums[m] == 1) {
                m++;
            } else {
                swap(nums, m, h);
                h--;
            }
        }
    }
}