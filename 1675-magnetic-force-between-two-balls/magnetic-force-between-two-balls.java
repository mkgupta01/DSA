// class Solution {
//     public int maxDistance(int[] position, int m) {
//         Arrays.sort(position);

//         int s=1, e=position[position.length-1]-position[0];
//         while(s<=e){
//             int mid = s+(e-s)/2;
//             if(check(position, m, mid)){
//                 s=mid+1;
//             }else{
//                 e=mid-1;
//             }
//         }
//         return e;
//     }

//     static boolean check(int[] position, int balls, int dist){
//         int i = 1;
//         int currInd = 0;
//         while(i < position.length){
//             if(position[i] - position[currInd] >= dist){
//                 balls--;
//                 currInd=i;
//             }
//             i++;
//         }
//         return balls == 1;
//     }
// }

import java.util.Arrays;

class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);

        int s = 1, e = position[position.length - 1] - position[0];
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (check(position, m, mid)) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return e;
    }

    static boolean check(int[] position, int balls, int dist) {
        int count = 1;  // The first ball is always placed at the first position
        int last_position = position[0];  // Position of the last placed ball

        for (int i = 1; i < position.length; i++) {
            if (position[i] - last_position >= dist) {
                count++;
                last_position = position[i];
            }
            if (count >= balls) {
                return true;
            }
        }
        return false;
    }
}
