class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
       Map<Integer, Integer> freqMap = new TreeMap<>();
        for(int i: arr1){
            if(!freqMap.containsKey(i)){
                freqMap.put(i, 1);
            }else{
                freqMap.put(i, freqMap.getOrDefault(i,0)+1);
            }
        }
        int pnt = 0;
        for(int i: arr2){
            int freq = freqMap.get(i);
            for(int j=0;j<freq;j++){
                arr1[pnt++] = i;
            }
            freqMap.remove(i);
        } 

        System.out.println(freqMap);

        for(Map.Entry<Integer, Integer> ele : freqMap.entrySet()){
            int el = ele.getKey();
            int freq = ele.getValue();
            for(int i=0;i<freq;i++){
                arr1[pnt++] = el; 
            }
        }

        return arr1;
    }
}