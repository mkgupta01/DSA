class Solution {
    public int minBitFlips(int start, int goal) {
       int differnce = start ^ goal;
       int ans=0;
       while(differnce != 0){
           if((differnce & 1) == 1 ) ans++;
           differnce = differnce >> 1;
       }
       return ans;
    }
}