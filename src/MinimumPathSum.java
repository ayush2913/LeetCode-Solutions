//64. Minimum Path Sum
class Solution {
    public int minPathSum(int[][] grid) {
        if(grid.length == 0) return 0;
        int l2 = grid[0].length;
        if(l2 ==0) return 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<l2; j++){
                if(i==0&&j==0)continue;
                else if(i==0 && j!=0) grid[i][j] = grid[i][j-1]+grid[i][j];
                else if(i!=0 && j==0) grid[i][j] = grid[i-1][j]+grid[i][j];
                else{
                    grid[i][j] = Math.min(grid[i-1][j],grid[i][j-1])+grid[i][j];
                }
            }
        }

        return grid[grid.length-1][l2-1];
    }
}