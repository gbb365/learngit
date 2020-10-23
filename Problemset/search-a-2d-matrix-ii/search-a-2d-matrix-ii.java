
// @Title: 搜索二维矩阵 II (Search a 2D Matrix II)
// @Author: 15218859676
// @Date: 2020-10-23 14:03:53
// @Runtime: 5 ms
// @Memory: 44.1 MB

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /**
            又是搜索二维矩阵，找到就返回true，否则就返回false
            从右上角开始，类似二分搜索
            matrix[i][j] > target i--;
            matrix[i][j] < target i++;
        */
        if(matrix == null|| matrix.length == 0){
            return false;
        }
        int row = 0;
        int column = matrix[0].length-1;
        while(row < matrix.length && column >= 0 ){
            if(matrix[row][column] == target){
                return true;
            }else if(matrix[row][column] > target){
                column--;
            }else{
                row++;
            }
        }
        return false;
    }
}
