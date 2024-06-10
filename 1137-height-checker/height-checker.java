class Solution {
    public int heightChecker(int[] heights) {
        int[] temp = new int[heights.length];
        int ans = 0;
        for(int i=0;i< heights.length;i++){
            temp[i] = heights[i];
        }
        Arrays.sort(heights);
        for(int i=0;i< heights.length;i++){
            if(heights[i] != temp[i]){
                ans++;
            }
        }
        return ans;
    }
}