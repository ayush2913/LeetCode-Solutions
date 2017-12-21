/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class MaxBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {

        TreeNode root = ConstructMaxTree(nums, 0, nums.length-1);
        return root;

    }

    public TreeNode ConstructMaxTree(int[] nums, int start, int end){
        if(start<=end){
            int max = nums[start];
            int maxIndex = start;
            for(int i=start+1; i<=end; i++){
                if(max<nums[i]){
                    maxIndex = i;
                    max = nums[i];
                }
            }
            TreeNode root = new TreeNode(max);
            root.left = ConstructMaxTree(nums, start, maxIndex-1);
            root.right = ConstructMaxTree(nums, maxIndex+1, end);
            return root;
        }else{
            return null;
        }
    }
}