class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> p = new ArrayList<>();
        helper(p , nums, ans);
        return ans;
    }

    static void helper(List<Integer> p, int[] up, List<List<Integer>> ans){
        if(up.length == 0){
            ans.add(new ArrayList<>(p));
            return;
        }
        p.add(up[0]);
        helper(p, Arrays.copyOfRange(up, 1, up.length), ans);
        p.remove(p.size()-1);
        helper(p, Arrays.copyOfRange(up, 1, up.length), ans);
    }
}