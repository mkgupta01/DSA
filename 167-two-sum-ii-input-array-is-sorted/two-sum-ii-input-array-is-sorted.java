class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s=0, e = numbers.length -1;

        while(s<=e){
            int sum = numbers[s]+numbers[e];
            if(sum == target){
                return new int[] {s+1, e+1};
            }else if(sum > target){
                e=e-1;
            }else{
                s=s+1;
            }
        }

        return new int[] {-1,-1};
    }
}