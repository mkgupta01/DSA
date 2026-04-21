class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(new StringBuilder(), n, 0, 0, ans);
        return ans;
    }

    static void helper(StringBuilder p, int k, int cC, int oC, List<String> ans){
        if(p.length() == k * 2){
            ans.add(p.toString());
            return;
        }

        if(oC < k){
            p.append('(');
            helper(p, k, cC, oC + 1, ans);
            p.deleteCharAt(p.length() - 1);
        }

        if(cC < oC){
            p.append(')');
            helper(p, k, cC + 1, oC, ans);
            p.deleteCharAt(p.length() - 1);
        }
    }
}