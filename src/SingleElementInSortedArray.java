class Solution {
    public int singleNonDuplicate(int[] nums) {
        int index = binarySearchSingleElement(nums, 0, nums.length-1);
        return nums[index];
    }

    public int binarySearchSingleElement(int[] nums, int start, int end){
        int mid;
        if(start<=end){
            mid = start + (end-start)/2;
            //System.out.println(mid);
            if((mid!=0 && nums[mid] != nums[mid-1]) && (mid!=nums.length-1 && nums[mid] != nums[mid+1])){
                //System.out.println("condition");
                return mid;
            }else if(mid==0 && nums[mid] != nums[mid+1])
                return 0;
            else if(mid==nums.length-1 && nums[mid] != nums[mid-1])
                return mid;
            else{
                int right = binarySearchSingleElement(nums, start, mid-1);
                int left = binarySearchSingleElement(nums, mid+1, end);

                return left==-1?right:left;
            }
        }
        return -1;
    }
}