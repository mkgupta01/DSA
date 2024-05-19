class Solution {
    public int rob(int[] nums) {
        Integer[] dp = new Integer[nums.length + 1];
        return helper(nums, 0, nums.length, dp);
    }

    private int helper(int[] nums, int ind, int n, Integer[] dp){
        if (ind >= n) {
            return 0;
        }

        if(dp[ind] != null){
            return dp[ind];
        }

        int a = nums[ind] + helper(nums, ind+2, n, dp);
        int b = helper(nums, ind+1, n, dp);

        return dp[ind] = Math.max(a, b);
    }
}

    