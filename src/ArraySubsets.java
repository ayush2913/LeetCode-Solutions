// Solution to LeetCode Problem#78 - "subsets"
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int total_num=1;
        for(int i=0; i<nums.length; i++){
            total_num = total_num*2;
        }
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i=0; i<total_num; i++){
            List<Integer> subset = new ArrayList<Integer>();
            int num = i;
            int index=0;
            while(num>0){
                if(num%2 == 1)
                    subset.add(nums[index]);
                index++;
                num=num/2;
            }
            result.add(subset);
        }

        return result;

    }
}