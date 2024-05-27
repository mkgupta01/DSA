import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        helper(candidates, target, list, new ArrayList<>(), 0);
        return list;
    }

    static void helper(int[] arr, int tar, List<List<Integer>> list, List<Integer> l1, int ind) {
        if (tar == 0) {
            list.add(new ArrayList<>(l1));
            return;
        }

        if (ind == arr.length) {
            return;
        }

    
        if (arr[ind] <= tar) {
            l1.add(arr[ind]);
            helper(arr, tar - arr[ind], list, l1, ind);  
            l1.remove(l1.size() - 1);
        }

        
        helper(arr, tar, list, l1, ind + 1);
    }
}
