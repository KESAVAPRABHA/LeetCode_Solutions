class Solution {
    public String countAndSay(int n) {
        String s="1";
        n=n-1;
        while(n-->0){
            StringBuilder str=new StringBuilder();
            int count=1;
            for(int i=0;i<s.length();i++){
                if(i+1<s.length()&& s.charAt(i)==s.charAt(i+1)){
                    count+=1;
                }else{
                    str.append(count);
                    str.append(s.charAt(i));
                    count=1;
                }
            }
            System.out.println(str);
            s=str.toString();
        }
        return s;
    }
}