class Solution {
    public int numSteps(String s) {
        int carry = 0;
        int steps = 0;
        for(int i=s.length()-1;i>0;i--){
            char ch = s.charAt(i);
            if(ch - '0' + carry == 1){
                carry = 1;
                steps+=2;
            }else{
                steps+=1;
            }
        }
        return steps+carry;
    }
}