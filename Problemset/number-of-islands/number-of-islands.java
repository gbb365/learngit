
// @Title: 岛屿数量 (Number of Islands)
// @Author: 15218859676
// @Date: 2020-12-17 20:27:14
// @Runtime: 2 ms
// @Memory: 40.7 MB

class Solution {
    private boolean[][] visit;
    private int m;
    private int n;
    private int[][] positin = {{0,1},{1,0},{0,-1},{-1,0}};
    private char[][] grid;
    public int numIslands(char[][] grid) {
        //返回网格中岛屿的数量,怎么判断找到一个岛？四周全是0
        m = grid.length;
        if( m == 0){
            return 0;
        }
        this.grid = grid;
        int count = 0;
        n = grid[0].length;
        visit = new boolean[m][n];
        for(int i = 0 ; i < m ; i ++){
            for( int j = 0 ; j < n ; j ++){
                //是1就当作是一个岛屿，然后向四周扩散，但是count不增
                if(!visit[i][j] && grid[i][j] == '1'){
                    //数量+1
                    count ++;
                    //递归搜索
                    dfs(i, j);
                }
            }
        }
        return count;
    }
    public void dfs(int i, int j ){
        visit[i][j] = true;
        //分别搜索4个位置
        for(int k = 0 ; k < 4 ; k ++){
            int newX = i + positin[k][0];
            int newY = j + positin[k][1];
            //不越界，没有访问过，而且新坐标必须是‘1’才继续四个方向搜索，否则就回到上一个for开始下一个位置
            if(inArea(newX, newY) && !visit[newX][newY] && grid[newX][newY] == '1'){
                dfs(newX, newY);
            }
        }
        //不能清除状态，否则就是求每次都递归出来统计一次‘1’
        //visit[i][j] = false;
    }


    public boolean inArea(int i, int j ){
        return i >= 0 && j >= 0 && i < m && j < n;
    }
}
