import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char c[]=s.toCharArray();
        Arrays.sort(c);
        String new1=new String(c);

        char d[]=t.toCharArray();
        Arrays.sort(d);
        String new2=new String(d);

        return new1.equals(new2);
    }
}
