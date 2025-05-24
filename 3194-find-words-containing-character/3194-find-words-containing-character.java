class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer>a=new ArrayList<>();
        int i=0;
        for(String a1:words){
            int t=a1.indexOf(x);
            if(t!=-1)a.add(i);
            i++;
        }
        return a;
    }
}