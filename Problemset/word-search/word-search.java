
// @Title: 单词搜索 (Word Search)
// @Author: 15218859676
// @Date: 2020-12-17 21:01:01
// @Runtime: 7 ms
// @Memory: 40.6 MB

class Solution {
    private char[][] board;
    private String word;
    private int m;
    private int n;
    private boolean[][] visit;
    private int[][] direction = {{0,1},{1,0},{0,-1},{-1,0}};
    public boolean exist(char[][] board, String word) {
        //判断单词是否在网格中
        //回溯，4个方向一次搜索
        this.board = board;
        this.m = board.length;
        if(m == 0){
            return false;
        }
        this.n = board[0].length;
        this.word = word;
        this.visit = new boolean[m][n];
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j ++){
                if(dfs(i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(int i, int j, int start){
        if(start == word.length() - 1){
            return board[i][j] == word.charAt(start);
        }
        if(board[i][j] == word.charAt(start)){
            visit[i][j] = true;
            for(int k = 0 ; k < 4 ; k ++){
                int newX = i + direction[k][0];
                int newY = j + direction[k][1];
                if(inArea(newX, newY)&& !visit[newX][newY]){
                    if(dfs(newX, newY,start + 1)){
                        return true;
                    }
                }
            }
            //递归出来后，清除状态
            //找到一个前缀相等，在后面不匹配的时候，需要回溯寻找另外一个前缀是否匹配
            visit[i][j] = false;
        }
        return false;
    }
    public boolean inArea(int i, int j){
        return i >= 0 && j >=0 && i < m && j < n;
    }
}
