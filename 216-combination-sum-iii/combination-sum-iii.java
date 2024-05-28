class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<List<Integer>> ans = new ArrayList<>();
        helper(new ArrayList<>(), k, n, ans, arr, 0);
        return ans;
    }

    static void helper(List<Integer> p, int k, int sum, List<List<Integer>> ans, int[] arr, int ind){
        if(p.size() == k){
            if(sum == 0){
                ans.add(new ArrayList<>(p));
            }
            return;
        }
        
        if(ind == arr.length){
            return;
        }

        p.add(arr[ind]);
        helper(p, k, sum-arr[ind], ans, arr, ind+1);
        p.remove(p.size()-1);
        helper(p, k, sum, ans, arr, ind+1);

    }
}