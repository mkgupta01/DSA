class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int minSum = Integer.MAX_VALUE;
        Integer[][] dp = new Integer[matrix.length+1][matrix[0].length+1];
        for (int c = 0; c < matrix[0].length; c++) {
            minSum = Math.min(minSum, helper(matrix, 0, c, dp));
        }
        return minSum;
    }

    int helper(int[][] grid, int r, int c, Integer[][] dp){
        if(r == grid.length-1){
            return grid[r][c];
        }

        int down=Integer.MAX_VALUE, leftD=Integer.MAX_VALUE, rightD=Integer.MAX_VALUE;
        down = helper(grid, r+1, c, dp);

        if(dp[r][c] != null){
            return dp[r][c];
        }

        if(c > 0){
            leftD = helper(grid, r+1, c-1, dp);
        }
        if(c < grid[0].length-1){
            rightD = helper(grid, r+1, c+1, dp);
        }

        return dp[r][c] = grid[r][c] + Math.min(Math.min(leftD, rightD), down);
    }

}