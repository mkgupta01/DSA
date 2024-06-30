class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        return Math.max(helper(blue, red), helper(red, blue));
    }

    static int helper(int first, int sec){
        int ans = 0;
        int step = 1;
        while(true){
            if(step%2 == 0){
                sec= sec-step;
                if(sec < 0) break;
            }else{
                first = first-step;
                if(first < 0) break;
            }
            step++;
            ans++;
        }
        return ans;
    }
}