class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i:nums){
            if(!freq.containsKey(i)){
                freq.put(i,1);
            }else{
                int frequency = freq.get(i);
                freq.replace(i,frequency+1);
            }
        }
        
        int[] ans = new int[k];

        for(int j = 0; j < k; j++){
            int currans = 0;
            int maxFreq = 0;
            for(int i : freq.keySet()){
                int temp = freq.get(i);

                if(temp > maxFreq){
                    currans = i;
                    maxFreq = freq.get(i);
                }
            }
            ans[j] = currans;
            freq.put(currans, 0);
        }

        return ans;
    }
}