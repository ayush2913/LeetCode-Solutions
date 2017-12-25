/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int rob(TreeNode root) {
        return Math.max(robByGivenValue(root)[0],robByGivenValue(root)[1]);
    }

    public int[] robByGivenValue(TreeNode root){
        int[] result = new int[2];
        if(root==null){
            result[0] = 0;
            result[1] = 0;
            return result;
        }

        int[] leftValue = robByGivenValue(root.left);
        int[] rightValue = robByGivenValue(root.right);
        result[1] = Math.max(leftValue[0], leftValue[1]) + Math.max(rightValue[0], rightValue[1]);
        result[0] = leftValue[1]+ rightValue[1] + root.val;
        return result;
    }
}