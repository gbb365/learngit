
// @Title: 岛屿的周长 (Island Perimeter)
// @Author: 15218859676
// @Date: 2020-12-18 00:08:38
// @Runtime: 16 ms
// @Memory: 40.4 MB

class Solution {
    private int count;
    private int[][] position = {{0,1},{1,0},{0,-1},{-1,0}};
    public int islandPerimeter(int[][] grid) {
       int m = grid.length;
       if(m == 0 ){
           return 0;
       }
       int n = grid[0].length;
       boolean[][] visit = new boolean[m][n];
       for(int i = 0 ; i < m ; i++){
           for(int j = 0 ; j < n ; j++){
               //只有一个大的岛屿，只要为1，就是递归入口
               if(grid[i][j] == 1){
                   dfs(grid, visit, i, j);
                   return count;
               }
           }
       }
       return 0;
    }
    //dfs,碰到水域直接+1，超出边界也要+1（相当于外围全是水域），如果已经访问过了的直接结束跳过，
    //没访问过，又是1的位置，就要设置成已访问，然后循环递归遍历它的四个方向，全局变量记录变化的周长
    public void dfs(int[][] grid,boolean[][] visit,int i,int j){
        if(!inArea(grid,i,j)){
            count++;
            return;
        }
        if(visit[i][j]){
            return;
        }
        if(grid[i][j] == 0){
            count++;
            return;
        }
        //写回溯总是忘记这个状态，然后就转圈，栈就溢出了。
        visit[i][j] = true;
        for(int k = 0 ; k < 4 ;k++){
            dfs(grid, visit, i + position[k][0], j + position[k][1]);
        }
    }
  
    public boolean inArea(int[][]grid,int i, int j){
        return i >= 0 && j >= 0 && i < grid.length && j < grid[0].length;
    }
}
