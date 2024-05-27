class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper("", n, 0, 0, ans);
        return ans;
    }

    static void helper(String p, int k, int cC, int oC, List<String> ans){
        //cC = closing count depict number of closing brackets
        //oC = opening count depicts numbe rof opening brackets        
        if(p.length() == k*2){
            ans.add(p);
            return;
        }

        if(oC < k){
            helper(p+"(", k ,cC, oC+1, ans);
        }
        if(cC < oC){
            helper(p+")", k, cC+1,oC, ans);
        }
    }
}