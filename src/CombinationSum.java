//39. Combination Sum
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(candidates.length == 0) return result;
        List<Integer> sumArray = new ArrayList<Integer>();
        recursiveCombinationSum(candidates, target, result, sumArray, 0);
        return result;

    }
    public void recursiveCombinationSum(int[] candidates, int target, List<List<Integer>> result, List<Integer> sumArray, int start){
        if(target == 0){
            result.add(new ArrayList(sumArray));
        }else{
            for(int i=start; i<candidates.length; i++){
                if(target-candidates[i]>=0){
                    int newTarget = target-candidates[i];
                    sumArray.add(candidates[i]);
                    recursiveCombinationSum(candidates, newTarget, result, sumArray, i);
                    sumArray.remove(sumArray.size()-1);
                }
            }
        }
    }

}