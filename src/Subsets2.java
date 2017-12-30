//90. Subsets II
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums.length == 0) return result;
        Arrays.sort(nums);
        List<Integer> subArray = new ArrayList<Integer>();
        recursiveSubsetsWithDup(nums,0,result,subArray);
        return result;
    }
    public void recursiveSubsetsWithDup(int[] nums, int start, List<List<Integer>> result, List<Integer> subArray){
        result.add(new ArrayList(subArray));
        for(int i=start; i<nums.length; i++){
            if(i>start && nums[i]==nums[i-1])continue;
            else{
                subArray.add(nums[i]);
                recursiveSubsetsWithDup(nums,i+1,result,subArray);
                subArray.remove(subArray.size()-1);
            }
        }
    }
}