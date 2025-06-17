class Solution {
    public void dfs ( int i ,int j, char[][] grid , boolean[][] vis ){
        int n= grid.length;
        int m= grid[0].length;
        if(i<0 || j<0 || i>= n || j>=m || vis[i][j] == true || grid[i][j]=='0' ) {
            return;
        }
        vis[i][j]= true;
        dfs(i-1, j , grid, vis);
        dfs(i+1,j,grid,vis);
        dfs(i,j+1,grid,vis);
        dfs(i,j-1,grid,vis);

    }
    public int numIslands(char[][] grid) {
        int n= grid.length;
        int m = grid[0].length;

        int c=0;
        boolean [][] vis = new boolean [n][m];
        for (int i = 0 ;i<n; i++){
            for(int j =0 ; j<m;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    dfs( i, j ,grid , vis);
                    c++;
                }
            }
        }
        return c;
    }
}