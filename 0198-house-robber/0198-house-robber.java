class Solution {
    public int solve(int i , int[] nums ,int[] dp){
        if (i==0) return nums[i];
        if(i<0) return 0;
         if(dp[i] != -1) return dp[i];
        int rob = nums[i] + solve(i-2 , nums ,dp);
        int notrob = solve(i-1, nums , dp);
        return dp[i]= Math.max(rob , notrob);
    }
    public int rob(int[] nums) {
        int [] dp = new int[nums.length];
        Arrays.fill(dp,-1);
      return solve(nums.length-1, nums ,dp);  
    } 
}