
// @Title: 不同路径 II (Unique Paths II)
// @Author: 15218859676
// @Date: 2021-01-12 11:19:29
// @Runtime: 0 ms
// @Memory: 37.9 MB

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(obstacleGrid[i][j] == 1){
                    continue;
                }
                if(i == 0 && j == 0){
                    dp[i][j] = 1 ;
                }else if( i == 0  ){
                    dp[i][j] = dp[i][j-1];
                }else if(j == 0){
                    dp[i][j] = dp[i - 1][j];
                }else{
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
