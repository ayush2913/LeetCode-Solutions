class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0)
            return false;
        int row = matrix.length-1;
        for(int i=0; i<matrix.length; i++){
            if(matrix[i].length>0 && target<matrix[i][0]){
                row = i-1;
                break;
            }
        }
        for(int j=0; row>=0 && j<matrix[row].length; j++){
            if(matrix[row][j] == target)
                return true;
        }
        return false;
    }
}