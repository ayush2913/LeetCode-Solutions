public class MinimumMovesToEqualArrayElements {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = (nums.length-1)/2;
        int median = nums[mid];
        if(nums.length%2 == 0){
            median = (nums[mid]+nums[mid+1])/2;
        }
        int sum = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            count = count+ Math.abs(median - nums[i]);
        }
        return count;

    }
}
