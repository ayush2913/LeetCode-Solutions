//300. Longest Increasing Subsequence
class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0) return 0;
        int[] LIS = new int[nums.length];
        LIS[0]=1;
        int maxAns = 1;
        for(int i=1; i<nums.length; i++){
            int maxLen=0;
            for(int j=0; j<i; j++){
                if(nums[i]>nums[j]) maxLen = Math.max(maxLen, LIS[j]);
            }
            LIS[i] = maxLen+1;
            maxAns = Math.max(maxAns, LIS[i]);
        }
        return maxAns;
    }
}