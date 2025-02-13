class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        List<Integer>l1=new ArrayList<>();
        for(int i=0;i<s2.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                l1.add(i);

            }
            if(l1.size()>2)return false;
        }
        if(l1.size()==2 && ((s1.charAt(l1.get(0)))==(s2.charAt(l1.get(1))))&&((s1.charAt(l1.get(1)))==(s2.charAt(l1.get(0))))){
            return true;
        }
        return false;
    }
}