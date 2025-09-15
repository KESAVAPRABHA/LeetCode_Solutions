class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count=0;
        for(String word: words){
            boolean can=true;
            for(char c: brokenLetters.toCharArray()){
                if(word.indexOf(c)!=-1){
                    can=false;
                    break;
                }
            }
            if(can)count++;
        }
        return count;
    }
}