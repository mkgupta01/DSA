class Solution {
    public String frequencySort(String s) {
        char ch[] = s.toCharArray();
        int n = ch.length;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            map.put(ch[i], map.getOrDefault(ch[i],0)+1);
        }
        ArrayList<pair> lst = new ArrayList<>();
        for(Character ci : map.keySet()){
            lst.add(new pair(ci,map.get(ci)));
        } 
        Collections.sort(lst);
        String str = "";
        for(int i = 0; i<lst.size(); i++){
            int count = lst.get(i).co;
            char alp = lst.get(i).c;
            for(int j = 0; j<count; j++){
                str += alp;
            }
        }
        return str;
    }
}
class pair implements Comparable<pair>{
    char c;
    int co;
    pair(char c, int co){
        this.c = c;
        this.co = co;
    }public int compareTo(pair other){
        return other.co-this.co;
    }
    
}