class Solution {
    public int climbStairs(int n) {
        Integer[] dp = new Integer[n+1];
        return helper(n, dp);
    }

    static int helper(int n, Integer[] dp){
        if(n <= 2){
            return n;
        }
        if(dp[n] != null){
            return dp[n];
        }
        return dp[n] = helper(n-1,dp) + helper(n-2,dp);
    }
}