
// @Title: 旋转图像 (Rotate Image)
// @Author: 15218859676
// @Date: 2020-12-08 20:36:17
// @Runtime: 0 ms
// @Memory: 38.7 MB


class Solution {
    public void rotate(int[][] matrix) {
        //将给定的矩阵旋转90°，原地修改，不能使用其他矩阵来表示
        //方法1，先转置，然后再翻转
//        int len = matrix.length;
//        //转置
//        for(int i = 0 ; i < len ; i++){
//            for(int j = i ; j < len; j++){
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//            }
//        }
//        //每一行的前后对换
//        for(int i = 0 ; i < len; i++){
//            for (int j = 0 ; j < len / 2 ; j++){
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[i][len - j - 1];
//                matrix[i][len - 1 - j] = temp;
//            }
//        }
        //转圈法
        int temp;
        for(int x = 0 , y = matrix.length-1; x < y ;x++, y--){
            for(int s = x ,e = y ; s < y ; s++, e-- ){
                temp = matrix[x][s];
                matrix[x][s] = matrix[e][x];
                matrix[e][x] = matrix[y][e];
                matrix[y][e] = matrix[s][y];
                matrix[s][y] = temp;
            }
        }

    }
}

