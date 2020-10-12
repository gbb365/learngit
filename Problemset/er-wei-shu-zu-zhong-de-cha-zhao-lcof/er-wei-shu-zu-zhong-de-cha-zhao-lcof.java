
// @Title: 二维数组中的查找 (二维数组中的查找 LCOF)
// @Author: 15218859676
// @Date: 2020-10-12 13:33:49
// @Runtime: 0 ms
// @Memory: 44.2 MB

class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //暴力.不是本题的目的...
        // for(int i = 0 ;i<matrix.length;i++){
        //     for(int j = 0 ;j<matrix[i].length;j++){
        //         if(matrix[i][j]==target){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        /*  从右上角开始走
            如果当前位置元素比target小，则row++
            如果当前位置元素比target大，则col--
            如果相等，返回true
            如果越界了还没找到，说明不存在，返回false
        */
        if(matrix == null || matrix.length ==0){
            return false;
        }
        int m = matrix.length,n=matrix[0].length;
        int row = 0,col = n-1;
        while(row<m&&col>=0){
            if(matrix[row][col]>target){
                col--;
            }else if(matrix[row][col]<target){
                row++;
            }else{
                return true;
            }
        }
        return false;
    }
}
