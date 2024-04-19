class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int ans = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                stack.push('(');
            }else{
                if(stack.isEmpty()){
                    ans+=1;
                }else{
                    char pop = stack.pop();
                }
            }
        }
        return ans + stack.size();
    }
}