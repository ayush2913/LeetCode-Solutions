//560. Subarray Sum Equals K
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums.length==0) return 0;
        int sum = 0, res=0;
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        map.put(0,1);
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            if(map.get(sum-k)!=null)
                res+=map.get(sum-k);
            if(map.get(sum)!=null){
                map.put(sum, map.get(sum)+1);
            }else{
                map.put(sum, 1);
            }

        }
        return res;
    }
}