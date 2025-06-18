class Solution {
    class Pair{
        int i ;int j;
        int time;
        public Pair(int i , int j ,int time ){
            this.i=i;
            this.j=j;
            this.time= time;
        }
    }
    public int orangesRotting(int[][] grid) {
        int n= grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int[][] vis = new int[n][m];
        int fresh=0;
        int max=0;
        for (int i =0;  i < n ;i++){
            for(int j=0; j < m ; j++){
                if (grid[i][j]==1) fresh++;
                else if(grid[i][j]== 2){
                    q.offer(new Pair(i,j,0));
                }
            }
        }
        while(!q.isEmpty()){
            Pair pair = q.poll();
            int i = pair.i;
            int j =pair.j;
            int time = pair.time;
            max= Math.max(max,time);
            if (i-1>=0 && grid[i-1][j]==1 && vis[i-1][j]!=2){
                q.offer(new Pair(i-1,j,time+1));
                fresh--;
                vis[i-1][j]=2;
            }
            if (i+1<n && grid[i+1][j]==1 && vis[i+1][j]!=2){
                q.offer(new Pair(i+1,j,time+1));
                fresh--;
                vis[i+1][j]=2;
            }
            if (j-1>=0 && grid[i][j-1]==1 && vis[i][j-1]!=2){
                q.offer(new Pair(i,j-1,time+1));
                fresh--;
                vis[i][j-1]=2;
            }
            if (j+1<m && grid[i][j+1]==1 && vis[i][j+1]!=2){
                q.offer(new Pair(i,j+1,time+1));
                fresh--;
                vis[i][j+1]=2;
            }
        }
        return fresh == 0?  max:-1;
    }
}