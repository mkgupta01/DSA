class Solution {
    int cnt;
    public int uniquePaths(int m, int n) {
        Integer[][] dp = new Integer[m+1][n+1];
        return helper(m, n, 0, 0, dp);
        // return cnt;
    }

    int helper(int m, int n, int r, int c, Integer[][] dp){
        if(r == m-1 && c == n-1){
            return 1;
        }

        if(dp[r][c] != null){
            return dp[r][c];
        }
        int right = 0, down = 0;
        if(c < n){
            right = helper(m, n, r, c+1, dp);
        }
        if(r < m){
            down = helper(m, n, r+1, c, dp);
        }
        return dp[r][c] = down + right;
    }
}