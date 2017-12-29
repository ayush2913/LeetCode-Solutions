class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1) return nums[0];
        int index = binarySearchMin(nums,0,nums.length-1);
        return nums[index];
    }
    public int binarySearchMin(int[] nums, int start, int end){
        if(start<=end){
            int mid = start + (end-start)/2;
            if(mid==0 && nums[mid]<nums[mid+1] || mid==nums.length-1 && nums[mid]<nums[mid-1] || nums[mid]<nums[mid+1]&&nums[mid]<nums[mid-1]){
                return mid;
            }
            if(nums[mid]>nums[nums.length-1])
                return binarySearchMin(nums,mid+1,end);
            if(nums[mid]<nums[nums.length-1])
                return binarySearchMin(nums,start,mid-1);
        }
        return -1;
    }

}