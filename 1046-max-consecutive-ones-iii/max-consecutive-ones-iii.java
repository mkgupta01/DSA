class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0, j=0;
        int ans = 0;
        int temp = k;
        while(j < nums.length){
            if(nums[j] == 1){
                j++;
                ans = Math.max(ans, j - i);
            }else{
                if(temp > 0){
                    j++;
                    temp--;
                    ans = Math.max(ans, j - i);
                }else{
                    i++;
                    if(nums[i-1] == 0){
                        temp++;
                    }
                }
            }
        }
        return ans;
    }
}