
// @Title: 不同路径 (Unique Paths)
// @Author: 15218859676
// @Date: 2021-01-12 10:27:36
// @Runtime: 0 ms
// @Memory: 35.1 MB

class Solution {
    public int uniquePaths(int m, int n) {
        int [][] arr = new int[m][n];
        for(int i = 0 ; i < m ;i ++){
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = 1;
            }
        }
        for(int i = 1 ; i < m ; i ++){
            for(int j = 1 ; j < n ; j ++){
                arr[i][j] = arr[i][j - 1 ] + arr[i - 1][j];
            }
        }
        return arr[m - 1][n - 1];
    }
}
