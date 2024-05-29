class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
       
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '[' || ch == '{' || ch == '('){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char pop = stack.peek();
                if(ch - pop == 1 || ch - pop == 2){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}