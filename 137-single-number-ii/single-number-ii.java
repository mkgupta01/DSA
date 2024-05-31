class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        int ind = 0;
        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i, map.getOrDefault(i,0)+1);
            }else{
                map.put(i, 1);
            }
        }

        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i]) == 1){
                ans = nums[i];
            }
        }

        return ans;
    }
}