public class SumRootToLeaf {
    public int sumNumbers(TreeNode root) {

        List<Integer> sum = new ArrayList<Integer>();
        sum.add(0);
        int number = 0;
        if(root == null){
            return 0;
        }else{
            findNumberAndSum(root, number, sum);
        }

        return sum[0];
    }

    public void findNumberAndSum(TreeNode root, int number, ArrayList<Integer> sum){
        if(root == null){
            sum[0] = sum[0]+number;
            return;
        }else{
            number = number*10 + root.val;
            findNumberAndSum(root.left, number, sum);
            findNumberAndSum(root.right, number, sum);
        }
    }


}
