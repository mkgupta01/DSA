class Solution {
    public void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void rev(int nums[], int i, int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int idx= -1;
        for(int i=nums.length-2; i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx = i;
                break;
            }
        }
        if(idx==-1){
            rev(nums,0,nums.length-1);
            return;
        }
        for(int i = nums.length-1; i>idx; i--){
            if(nums[idx]<nums[i]){
                swap(nums,idx,i);
                break;
            }
        }
        rev(nums, idx+1, nums.length-1);
    }
}