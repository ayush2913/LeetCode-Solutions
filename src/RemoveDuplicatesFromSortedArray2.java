//80. Remove Duplicates from Sorted Array II
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(count<2 ||  nums[i]>nums[count-2]){
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}