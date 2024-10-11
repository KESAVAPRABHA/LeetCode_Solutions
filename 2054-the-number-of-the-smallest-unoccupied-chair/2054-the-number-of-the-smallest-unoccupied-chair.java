class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int target=times[targetFriend][0];
        Arrays.sort(times,(a,b)->a[0]-b[0]);
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<times.length;i++){
            pq.offer(i);
        }
        PriorityQueue<int[]>pq1=new PriorityQueue<>((a,b) -> a[0]-b[0]);
        for(int i=0;i<times.length;i++){
            while(!pq1.isEmpty() && pq1.peek()[0]<=times[i][0]){
                pq.offer(pq1.poll()[1]);
            }
            if(times[i][0]==target){
                break;
            }
            pq1.offer(new int[]{ times[i][1], pq.poll()});

        }
        return pq.peek();
    }
}