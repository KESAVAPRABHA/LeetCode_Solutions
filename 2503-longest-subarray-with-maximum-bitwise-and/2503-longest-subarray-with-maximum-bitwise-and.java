class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        int c=0;
        ArrayList<Integer>a=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(max==nums[i]){
                c=c+1;
            }
            else{
                c=0;
            }
            a.add(c);
        }
        return Collections.max(a);
    }
}