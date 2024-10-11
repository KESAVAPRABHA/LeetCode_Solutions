class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int target=times[targetFriend][0];
        Arrays.sort(times,(a,b)->a[0]-b[0]);
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<times.length;i++){
            pq.offer(i);
        }
        PriorityQueue<int[]>pq1=new PriorityQueue<>((a,b) -> a[0]-b[0]);
        for (int i = 0; i < times.length; i++) {
            while (!pq1.isEmpty() && pq1.peek()[0] <= times[i][0]) {
                pq.offer(pq1.poll()[1]); // Free up chairs as friends leave
            }
            if (times[i][0] == target) { // When we reach the target friend's arrival time
                break; // Stop the loop, since we only care about the target friend
            }
            pq1.offer(new int[]{times[i][1], pq.poll()}); // Assign the next available chair to the current friend
        }

        return pq.peek();
    }
}