class BattleShip {
    public int countBattleships(char[][] board) {
        int count = 0;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(i==0 && board[i][j]=='X' && (j==0||board[i][j-1]=='.')){
                    count++;
                }
                if(i>0 && board[i][j]=='X' && ((j==0 && board[i-1][j]!='X') || (board[i-1][j]!='X'&& board[i][j-1]!='X'))){
                    count++;
                }
            }
        }
        return count;

    }
}