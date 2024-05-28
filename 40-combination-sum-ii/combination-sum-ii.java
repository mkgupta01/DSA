class Solution {
    void helper(int[] candidates,int target,int ind,List<List<Integer>> output,List<Integer> li){
        if(target==0){
            output.add(new ArrayList<>(li));
            return;
        }
        if(target<0 || ind>=candidates.length) return;
        int key=candidates[ind];
        li.add(key);
        helper(candidates,target-candidates[ind],ind+1,output,li);
        li.remove(li.size()-1);
        while(ind<candidates.length && candidates[ind]==key) ind++;
        helper(candidates,target,ind,output,li);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> output=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        helper(candidates,target,0,output,li);
        return output;
    }
}