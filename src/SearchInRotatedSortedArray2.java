//81. Search in Rotated Sorted Array II
public class Solution {
    public boolean search(int[] nums, int target) {
        int pivot = nums.length-1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                pivot = i;
            }
        }
        int index = -1;
        if(nums.length <= 0) return false;
        if(nums[0]<=target){
            index  = rotatedBinarySearch(nums,target,0,pivot);
        }else{
            index = rotatedBinarySearch(nums,target,pivot+1,nums.length-1);
        }
        if(index==-1) return false;
        return true;

    }

    public int rotatedBinarySearch(int[] nums, int target, int low, int high){
        if(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid]<target) return rotatedBinarySearch(nums,target,mid+1,high);
            if(nums[mid]>target) return rotatedBinarySearch(nums,target,low,mid-1);
        }
        return -1;
    }
}