class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return new ArrayList<>();
        }
        String[] pads = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> ans = new ArrayList<>();
        helper("", digits, pads, ans);
        return ans;
    }

    static void helper(String p, String up, String[] pads, List<String> ans){
        if(up.isEmpty()){
            ans.add(p);
            return;
        }

        int digit = up.charAt(0) - '0';
        String pad = pads[digit-2];

        for(int i=0;i<pad.length();i++){
            helper(p+pad.charAt(i), up.substring(1), pads, ans);
        }

    }
}