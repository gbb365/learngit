
// @Title: 矩阵置零 (Set Matrix Zeroes)
// @Author: 15218859676
// @Date: 2021-01-12 14:43:15
// @Runtime: 1 ms
// @Memory: 40 MB

class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        if(row == 0){
            return;
        }
        int col = matrix[0].length;
        boolean rowFlag = false;
        boolean colFlag = false;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j ++){
                if(matrix[i][j] == 0){
                    if(i == 0){
                        rowFlag = true;
                    }
                    if(j == 0 ){
                        colFlag = true;
                    }
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i = 1 ; i < row ;i++){
            for(int j = 1 ; j < col; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(rowFlag){
            for(int i = 0 ; i < col; i++){
                matrix[0][i] = 0;
            }
        }
        if(colFlag){
            for(int i = 0 ; i < row; i++){
                matrix[i][0] = 0;
            }
        }
    }
}
