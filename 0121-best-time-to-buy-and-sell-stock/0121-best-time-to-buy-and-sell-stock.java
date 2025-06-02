class Solution {
    public int maxProfit(int[] prices) {
        int pre = prices [0];
        int ans = 0;
        for (int price : prices){
            int cost = price - pre;
            ans = Math.max(ans , cost) ;
            pre =  Math.min( pre , price);
        }
        return ans;
    }
}