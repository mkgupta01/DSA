class Solution {
    public List<Integer> findAnagrams(String txt, String pat) {
        List<Integer> list = new ArrayList<>();
        int n = txt.length();
        int count = 0;
        int k = pat.length();
        int i = 0;
        while(i <= txt.length()-k){
           String sub = txt.substring(i,i+k);
           if(isAnagram(pat,sub)){
               list.add(i);
           }
           i++;
        }
       
       return list;
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] charCount = new int[26];
    
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        for(int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}