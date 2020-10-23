
// @Title: 搜索二维矩阵 (Search a 2D Matrix)
// @Author: 15218859676
// @Date: 2020-10-22 13:57:02
// @Runtime: 0 ms
// @Memory: 37.9 MB

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /**
            搜索二维矩阵（行列都是升序的），目标在矩阵中就返回true，否则就返回false
            类似二叉查找树，从右上角开始找
            if(target > matrix[i][j]) row++
            if(target < matrix[i][j]) column--
        */
        if(matrix == null|| matrix.length == 0){
            return false;
        }
        int row = 0;
        int column = matrix[0].length-1;
        while(row < matrix.length && column>=0){
            if(target> matrix[row][column]){
                row++;
            }else if(target < matrix[row][column]){
                column--;
            }else{
                return true;
            }
        }
        return false;

    }
}
