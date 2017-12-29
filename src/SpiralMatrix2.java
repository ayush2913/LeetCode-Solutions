//59. Spiral Matrix II

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        if(n==0) return result;
        int count=1;
        int left = -1;
        int top = -1;
        int right = n;
        int bottom = n;
        int i=-1, j=0;
        //j is row
        //i is column
        while(count<=n*n){
            if(i==left && j==top+1){
                count = goright(count, result, i+1, right-1, j);
                i = right-1;
                j=top+1;
                top = top+1;
            }
            if(i==right-1 && j==top){
                count = godown(count, result, i, j+1, bottom-1);
                i = right-1;
                j = bottom-1;
                right = right-1;
            }
            if(i==right && j==bottom-1){
                count = goleft(count, result, i-1, left+1, j);
                i = left+1;
                j = bottom-1;
                bottom -=1;
            }

            if(i==left+1 && j==bottom){
                count = goup(count, result, i, j-1, top+1);
                i = left+1;
                j = top+1;
                left +=1;
            }
        }

        return result;
    }
    public int goright(int count, int[][] result, int columnStart, int columnEnd, int row){
        for(int i=columnStart; i<=columnEnd; i++ ){
            result[row][i] = count;
            count++;
        }
        return count;
    }
    public int godown(int count, int[][] result, int column, int rowStart, int rowEnd){
        for(int i=rowStart; i<=rowEnd; i++){
            result[i][column] = count;
            count++;
        }
        return count;
    }
    public int goleft(int count, int[][] result, int columnStart, int columnEnd, int row){
        for(int i=columnStart; i>=columnEnd; i-- ){
            result[row][i] = count;
            count++;
        }
        return count;
    }
    public int goup(int count, int[][] result, int column, int rowStart, int rowEnd){
        //System.out.println("column"+Integer.tostring(column));
        for(int i=rowStart; i>=rowEnd; i--){

            result[i][column] = count;
            count++;
        }
        return count;
    }


}