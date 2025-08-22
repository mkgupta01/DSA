class Solution {
    public boolean check(int[] nums) {
        int pivot = 0;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                pivot+=1;
            }
        }

        int cnt = pivot;

        System.out.println(pivot);

        if(cnt == 0){
            return true;
        }else if(cnt > 1){
            return false;
        }else if(nums[0] >= nums[nums.length - 1]){
            return true;
        }else{
            return false;
        }
    }
}