class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int total=(n*(n+1))/2;
        int s=0;
        for(int c:nums){
            s+=c;
        }
        return total-s;
    }
}