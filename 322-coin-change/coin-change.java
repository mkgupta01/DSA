class Solution {
    public int coinChange(int[] coins, int amount) {
        Integer[] dp = new Integer[amount+1];
        int ans = helper(coins, amount, dp);
        return (ans == Integer.MAX_VALUE) ?  -1 : ans;
    }

    static int helper(int[] coins, int amt, Integer[] dp){
        if(amt == 0){
            return 0;
        }
        if(amt < 0){
            return Integer.MAX_VALUE;
        }

        if(dp[amt] != null){
            return dp[amt];
        }

        int ans = Integer.MAX_VALUE;

        for(int i=0;i<coins.length;i++){
            int subAns = helper(coins, amt-coins[i], dp);
            if(subAns != Integer.MAX_VALUE){
                ans = Math.min(subAns+1, ans);
            }
        }
        return dp[amt]=ans;
    }
}