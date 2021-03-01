
// @Title: 被围绕的区域 (Surrounded Regions)
// @Author: 15218859676
// @Date: 2021-01-10 15:20:01
// @Runtime: 2 ms
// @Memory: 40.2 MB

class Solution {
    public void solve(char[][] board) {
        //将边界,以及和边界相连的'O'都设置为-,最后遍历一次,将-变O,内部的O变X
        int row = board.length;
        if(row == 0){
            return;
        }
        int col = board[0].length;
        
        if(col == 0){
            return;
        }
        int[][] direction = new int[][]{{-1,0},{0,-1},{1,0},{0,1}};
        for(int i = 0 ; i < row; i++){
            if(board[i][0] == 'O'){
                dfs(i, 0 , board, direction);
            }
            if(board[i][col - 1] == 'O'){
                dfs(i, col - 1, board, direction);
            }
        }
        for(int j = 1 ; j < col-1 ; j++){
            if(board[0][j] == 'O'){
                dfs(0, j, board, direction);
            }
            if(board[row -1][j] == 'O'){
                dfs(row - 1, j, board, direction);
            }
        }
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ;j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }else if(board[i][j] == '-'){
                    board[i][j] = 'O';
                }
            }
        }

    }
    public void dfs(int i , int j ,char[][] board, int[][] direction){
        if(inArea(i, j, board)&&board[i][j] == 'O'){
            board[i][j] = '-';
            for(int k = 0 ; k < 4 ;k++){
                int newX = i + direction[k][0];
                int newY = j + direction[k][1];
                dfs(newX, newY, board, direction);
            }
        }
    }
    public boolean inArea(int row, int col, char[][] board){
        return row >= 0 && col >= 0 && row < board.length && col < board[0].length;
    }
}
