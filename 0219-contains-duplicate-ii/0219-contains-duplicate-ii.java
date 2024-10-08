class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>a=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(a.containsKey(nums[i])){
                int j=a.get(nums[i]);
                if(Math.abs(i-j)<=k){
                    return true;
                }
            }
            a.put(nums[i],i);
        }
        return false;
    }
}