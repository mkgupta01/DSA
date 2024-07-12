class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        String ans = "";
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                if(!stack.isEmpty()){
                    ans+="(";
                }
                stack.push(ch);
            }else{
                char pop = stack.pop();
                if(!stack.isEmpty()){
                    ans+=")";
                }
            }
            
        }
        return ans;
    }
}