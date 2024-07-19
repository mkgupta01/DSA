class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
               map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
               map.put(s.charAt(i),1);
            }
        }
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for(Character key : map.keySet()){
            int val=map.get(key);
            while(val>0 && set.contains(val)){
                count++;
                val--;
            }
            set.add(val);
        }
        return count;
    } 
}