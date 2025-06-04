class Solution {
    public int solve ( int i , int buy, int[]  prices , int [][] dp){
        if ( i >= prices.length) return 0;

        int profit = 0;
        if ( dp[i][buy] != -1) return dp[i][buy];
        if( buy == 1){
            dp[i][buy]=Math.max( -prices[i]+solve( i+1 , 0 , prices ,dp), solve(i+1 , 1 , prices ,dp));
        }
        else{
            dp[i][buy] = Math.max( prices[i]+ solve( i+1 ,1 ,prices, dp), solve( i+1 ,0 ,prices ,dp));
        }
        return dp[i][buy];
    }
    public int maxProfit(int[] prices ) {
          int [][] dp = new int[prices.length +1 ][2];
           for( int i =0 ; i <= prices.length ; i++ ){
              Arrays.fill( dp[i] , -1);
           }
        return solve( 0 , 1 , prices , dp );
    }
}