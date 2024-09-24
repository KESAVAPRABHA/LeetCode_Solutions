// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         HashMap<Integer,Integer>map=new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//         }
//         for(int i=0;i<map.size();i++){
//             if(map.get(nums[i])>=2){
//                 return true;
//             }
//         }
//         return false;
//     }
// }



// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         int n = nums.length;
//         for (int i = 1; i < n; i++) {
//             if (nums[i] == nums[i - 1])
//                 return true;
//         }
//         return false;
//     }
// }


class Solution {
    public boolean containsDuplicate(int[] nums) {
            int n = nums.length; // Step 1: Initialize variable to store length of nums
            Set<Integer> set = new HashSet<>(); // Step 2: Create HashSet to store unique elements
            for(int num : nums){
                set.add(num); // Step 3: Add elements of nums to the HashSet
            }
            int m = set.size(); // Step 4: Get the size of the HashSet
            if(n==m){    //Step 5: Compare lengths and return result
                return false; //Return false if there were  no duplicates, true otherwise
            }
            return true;   
            }
        }