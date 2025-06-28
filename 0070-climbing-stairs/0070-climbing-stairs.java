class Solution {
    public  int fistep( int n , int[] dp ){
        if (n== 0 || n == 1) return 1;
        if (dp[n-1] != -1) return dp[n-1];
        int opt1 = fistep(n-1 ,dp);
        int opt2 = fistep(n-2,dp);
        return dp[n-1]= opt1+opt2;
    }
    public int climbStairs(int n ) {
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return fistep(n , dp);
    }
}