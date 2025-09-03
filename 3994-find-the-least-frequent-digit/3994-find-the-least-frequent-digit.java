class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>list;
        while(n>0){
            int t=n%10;
            n=n/10;
            map.put(t,map.getOrDefault(t,0)+1);
        }
        int min=Collections.min(map.values());
        int res=9;
        for(int k:map.keySet()){
            if(map.get(k)==min){
                if(res>k){
                    res=k;
                }
            }
        }
        return res;
        
    }
}