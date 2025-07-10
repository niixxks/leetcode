class Solution {
    public int houserob(int n , int[] nums ,int[] dp){
        dp[0]= nums[0];
        for(int i = 1 ; i<nums.length; i++){
         int rob = nums[i];
         if(i>1) rob = nums[i] + dp[i-2];
         int notrob = dp[i-1];
         dp[i]= Math.max(notrob , rob);
        }
        return dp[nums.length - 1];
    }
    public int rob(int[] nums) {
        int [] dp = new int[nums.length];
        Arrays.fill(dp,0);
      return houserob(nums.length-1, nums ,dp);  
    } 
}