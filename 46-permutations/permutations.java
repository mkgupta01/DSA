class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(nums, ans, list);
        return ans;
    }

    static void helper(int[] nums, List<List<Integer>> ans, List<Integer> list){
        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                continue;
            }
            list.add(nums[i]);
            helper(nums, ans, list);
            list.remove(list.size() - 1);
        }
    }
}