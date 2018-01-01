// 565. Array Nesting
class Solution {
    public int arrayNesting(int[] nums) {
        if(nums.length == 0) return 0;
        int maxLen = 0;
        for(int i=0; i<nums.length; i++){
            int res = 0;
            int j = i;
            while(nums[j]>=0){
                int temp = nums[j];
                nums[j] = -1;
                j = temp;
                res++;
            }
            maxLen = Math.max(res,maxLen);
        }

        return maxLen;
    }
}