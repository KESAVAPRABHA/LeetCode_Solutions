class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> li = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                arr.add(i);
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (Math.abs(i - arr.get(j)) <= k) {
                    set.add(i); 
                    break; 
                }
            }
        }
        li.addAll(set);
        Collections.sort(li);
        return li;
    }
}
