class Solution {
    public String largestGoodInteger(String num) {
        String res="";
        for(int i=0;i+2<num.length();i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2)){
                res=res.compareTo(num.substring(i,i+3))>0?res:num.substring(i,i+3);
                //for lexographical comparision
            }
        }
        return res;
    }
}