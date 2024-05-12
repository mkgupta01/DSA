class Solution {
    public int findMin(int[] nums) {
        int pivot = findPivot(nums);
        return nums[pivot+1];
    }

    static int findPivot(int[] nums){
        int s = 0;
        int e = nums.length - 1;
        while(s <= e){
            int m = s + (e-s)/2;
            if(m > s && nums[m-1] > nums[m]){
                return m-1;
            }else if(m < e && nums[m] > nums[m+1]){
                return m;
            }else if(nums[s] <= nums[m]){
                s= m + 1;
            }else{
                e = m - 1;
            }
        }
        return -1;
    }
}