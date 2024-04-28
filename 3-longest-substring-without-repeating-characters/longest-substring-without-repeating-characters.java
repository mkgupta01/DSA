class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int i=0, j=0;
        int ans = 0;

        while(i<s.length() && j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                 j++;
            }else{
                set.remove(s.charAt(i));
                    i++;
                // while(set.contains(s.charAt(j))){
                //     set.remove(s.charAt(i));
                //     i++;
                // }
            }
            ans = Math.max(ans, j-i);   
        }
        return ans;
    }
}