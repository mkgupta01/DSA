class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        HashSet<List<Integer>> ans = new HashSet<>();
        helper(new ArrayList<>(), nums, ans);
        
        List<List<Integer>> finalAns = new ArrayList<>();
        for(List<Integer> l:ans){
            finalAns.add(l);
        }
        return finalAns;
    }

    static void helper(ArrayList<Integer> p, int[] up, HashSet<List<Integer>> ans){
        if(up.length == 0){
            List<Integer> temp = new ArrayList<>(p);
            Collections.sort(temp);
            ans.add(temp);
            return;
        }
        
        p.add(up[0]);
        helper(p, Arrays.copyOfRange(up, 1, up.length), ans);
        p.remove(p.size()-1);
        helper(p, Arrays.copyOfRange(up, 1, up.length), ans);
    }
}