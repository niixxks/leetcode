class Solution {
    class Pair{
        int i ;
        int j;
       public  Pair( int i , int j){
        this.i = i;
        this.j=j;
       }
    }
    public void bfs ( int row , int col , char[][] grid , boolean[][] vis){
         int n= grid.length;
          int m= grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair( row , col));
        vis[row][col] =true;
        while(!q.isEmpty()){
            Pair pair = q.poll();
            int i = pair.i;
            int j= pair.j;
            if(i-1>=0 && grid[i-1][j]=='1' && !vis[i-1][j]){
                q.offer(new Pair(i-1,j));
                vis[i-1][j] = true;
            }
            if(i+1<n && grid[i+1][j]=='1' && !vis[i+1][j]){
                q.offer(new Pair(i+1,j));
                vis[i+1][j] = true;
            }
            if(j-1>=0 && grid[i][j-1]=='1' && !vis[i][j-1]){
                q.offer(new Pair(i,j-1));
                vis[i][j-1] = true;
            }
            if(j+1<m && grid[i][j+1]=='1' && !vis[i][j+1]){
                q.offer(new Pair(i,j+1));
                vis[i][j+1] = true;
            }
           
        }
    }
    // public void dfs ( int i ,int j, char[][] grid , boolean[][] vis ){
    //     int n= grid.length;
    //     int m= grid[0].length;
    //     if(i<0 || j<0 || i>= n || j>=m || vis[i][j] == true || grid[i][j]=='0' ) {
    //         return;
    //     }
    //     vis[i][j]= true;
    //     dfs(i-1, j , grid, vis);
    //     dfs(i+1,j,grid,vis);
    //     dfs(i,j+1,grid,vis);
    //     dfs(i,j-1,grid,vis);
    //}
    public int numIslands(char[][] grid) {
        int n= grid.length;
        int m = grid[0].length;

        int c=0;
        boolean [][] vis = new boolean [n][m];
        for (int i = 0 ;i<n; i++){
            for(int j =0 ; j<m;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    bfs( i, j ,grid , vis);
                    c++;
                }
            }
        }
        return c;
    }
}