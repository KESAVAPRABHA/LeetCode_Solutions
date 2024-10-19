class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character>a =new HashSet<>();
        for(char c:jewels.toCharArray()){
            a.add(c);
        }
        int count=0;
        for(char k:stones.toCharArray()){
            if(a.contains(k)){
                count++;
            }
        }
        return count;
    }
}