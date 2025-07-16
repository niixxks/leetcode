class Solution {
    public int countcoin(int i, int amount, int[] coins, int[][] dp) {
        if (i == 0) {
            if (amount % coins[i] == 0) return amount / coins[i];
            else return (int) 1e9;
        }

        if (dp[i][amount] != -1) return dp[i][amount];

        int nottake = countcoin(i - 1, amount, coins, dp);
        int take = (int) 1e9;
        if (amount >= coins[i]) {
            take = 1 + countcoin(i, amount - coins[i], coins, dp);
        }

        return dp[i][amount] = Math.min(take, nottake);
    }

    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        for (int[] row : dp) Arrays.fill(row, -1);

        int ans = countcoin(n - 1, amount, coins, dp);
        return ans >= 1e9 ? -1 : ans;
    }
}
