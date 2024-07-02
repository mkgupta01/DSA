class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);

        int s=1, e=position[position.length-1]-position[0];
        while(s<=e){
            int mid = s+(e-s)/2;
            if(check(position, m, mid)){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return e;
    }

    static boolean check(int[] position, int balls, int dist){
        int i = 1;
        int count = 1;
        int currInd = 0;
        while(i < position.length){
            if(position[i] - position[currInd] >= dist){
                count++;
                currInd=i;
            }
            i++;
        }
        return count >= balls;
    }
}