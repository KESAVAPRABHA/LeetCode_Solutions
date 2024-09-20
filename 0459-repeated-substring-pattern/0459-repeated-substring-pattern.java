class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        String sub="";
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sub=s.substring(0,i);
                if(s.replaceAll(sub,"").isEmpty()){
                    return true;
                }
            }
        }
        return false;
    }
}