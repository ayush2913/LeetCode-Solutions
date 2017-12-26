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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<Integer> res = new ArrayList<Integer>();
        if(root==null){
            return res;
        }
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node==null){
                if(q.size()>0)
                    q.add(null);
            }else{
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
                if(q.peek()==null)
                    res.add(node.val);
            }
        }
        return res;
    }
}