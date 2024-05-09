class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 != 0){
            return false;
        }
        
        StringBuilder sr = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char first=s.charAt(i);
            if(first == '(' || first == '{' || first == '['){
                sr.append(first);
            }else{
                if(sr.length() == 0){
                    return false;
                }
                char last = sr.charAt(sr.length()-1);
                if(first - last == 1 || first - last == 2){
                    sr.deleteCharAt(sr.length()-1);
                }else{
                    return false;
                }
            }
        }
        if(sr.length() != 0){
            return false;
        }
        return true;
    }
}