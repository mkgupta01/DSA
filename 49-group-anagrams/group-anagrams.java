class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            String key = sortString(str);
            List<String> lst = map.get(key);
            if(map.containsKey(key)){
               map.get(key).add(str);
            }else{
                map.put(key, new ArrayList<>());
                map.get(key).add(str);
            }
        }
        for(String s : map.keySet()){
            ans.add(map.get(s));
        }
        return ans;
    }

    static String sortString(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String sorted = new String(arr);
        return sorted;
    }
}