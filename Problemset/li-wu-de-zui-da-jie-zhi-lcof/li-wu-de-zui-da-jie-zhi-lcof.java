
// @Title: 礼物的最大价值 (礼物的最大价值 LCOF)
// @Author: 15218859676
// @Date: 2021-01-13 10:34:01
// @Runtime: 4 ms
// @Memory: 41.3 MB

class Solution {
    public int maxValue(int[][] grid) {
        //向下或向右走，返回可以获取的最大价值
        //每次从上面或下面选择一个最大作为备忘值
        int row = grid.length;
        if(row == 0){
            return 0;
        }
        int col = grid[0].length;
        int[][] dp = new int[row][col];
        dp[0][0] = grid[0][0];
        for(int j = 1 ; j < col;j++){
            dp[0][j] = grid[0][j] + dp[0][j-1];
        }
        for(int i = 1 ; i < row ; i++){
            dp[i][0] = grid[i][0] + dp[i-1][0];
        }
        for(int i = 1 ; i < row ; i ++){
            for(int j = 1 ;j < col; j++){
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + grid[i][j];
            }
        }
        return dp[row - 1][col - 1];
    }
}
