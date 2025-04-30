class Solution {
    public int jump(int[] arr) {
        int dp[]=new int[arr.length];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<=arr[i];j++){
                if(i+j<arr.length){
                    dp[i+j]=Math.min(dp[i+j],dp[i]+1);
                }
            }
        }
        if(dp[arr.length-1]==Integer.MAX_VALUE) return -1;
        return dp[arr.length-1];
    }
}