class Solution {
    public boolean doesAliceWin(String s) {
        return s.chars().anyMatch(c->"aeiou".indexOf(c)>=0);
    }
}
//anyMatch is a streams Operation introduced in streams 8