//77. Combinations

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(n<k || k==0) return result;
        List<Integer> arr = new ArrayList<Integer>();
        combination(result, k, 1, n, arr);
        return result;
    }

    public void combination(List<List<Integer>> result, int size, int start, int end, List<Integer> arr){
        if(size == 0) result.add(new ArrayList(arr));
        else{
            for(int i=start; i<=end; i++){
                arr.add(i);
                combination(result, size-1, i+1, end, arr);
                arr.remove(arr.size()-1);
            }
        }
    }
}