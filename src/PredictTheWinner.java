class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int start=0;
        int end = nums.length -1;
        boolean flag = true;
        Integer [][] dp = new Integer[nums.length][nums.length];
        return minmax(nums, start,end, flag, dp)>=0?true:false;
    }

    public int minmax(int[] nums, int start, int end, boolean turn, Integer[][] dp){
        if(start==end)
            return nums[start];
        if(dp[start][end]!=null)
            return dp[start][end];
        int left = nums[start] - minmax(nums,start+1, end, !turn, dp);
        int right = nums[end] - minmax(nums,start, end-1, !turn, dp);
        dp[start][end] = Math.max(left,right);
        return dp[start][end];
    }
}