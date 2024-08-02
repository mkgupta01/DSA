class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for(int i=0;i<s.length()-10+1;i++){
            String temp = s.substring(i, i+10);
            map.put(temp, map.getOrDefault(temp, 0)+1);
        }
        
        for(Map.Entry<String, Integer> e:map.entrySet()){
            if(e.getValue() > 1){
                list.add(e.getKey());
            }
        }

        return list;
    }
}