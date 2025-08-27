class Solution {
    public int lengthOfLastWord(String s) {
        String k=s.trim();
        int i=0;
        int c=0;
        int n=s.length();
        for(i=k.length()-1;i>=0;i--){
            if(k.charAt(i)==' '){
                break;
            }
            c++;
        }
        return c;
    }
}