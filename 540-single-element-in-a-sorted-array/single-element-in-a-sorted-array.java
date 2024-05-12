class Solution {
    static int singleNonDuplicate(int[] arr) {
        if(arr.length == 1){
            return arr[0];
        }

        if(arr[arr.length-1] != arr[arr.length-2]){
            return arr[arr.length-1];
        }

        if(arr[0] != arr[1]){
            return arr[0];
        }

        int s = 0;
        int e = arr.length-1;
        while(s <= e){
            int m = s + (e-s)/2;
            if(m >= s && m <= e && arr[m] != arr[m-1] && arr[m] != arr[m+1]){
                return arr[m];
            }else if(arr[m] == arr[m+1] && m%2 != 0){
               e = m-1;
            }else if(arr[m] == arr[m+1] && m%2 == 0){
                s = m + 1;
            }else if(arr[m] == arr[m-1] && m%2 != 0){
                s = m+1;
            }else{
                e = m-1;
            }
        }
        return -1;
    }
}