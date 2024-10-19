class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==arr[i]){
                l.add(arr[i]);
            }
        }
        if(l.size()>0){
            return Collections.max(l);
        }else{
            return -1;
        }
    }
}