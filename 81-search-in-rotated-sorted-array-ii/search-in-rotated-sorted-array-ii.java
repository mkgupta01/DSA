class Solution {
    public boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);
        boolean ans;
        if(nums[0] == target){
            return true;
        }
        if(nums.length > 1 && nums[0] < nums[nums.length-1]){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(pivot == -1){
            return false;
        }
        if(nums[0] < target){
            ans = binarySearch(nums,target,0,pivot);
        }else{
            ans = ans = binarySearch(nums,target,pivot+1,nums.length-1);
        }
        return ans;
    }
    
    static int findPivot(int[] arr){
        int s=0,e=arr.length-1;
        while(s <= e){
            int m=s+(e-s)/2;
            // 4 case goes here
            if(m < e && arr[m] > arr[m+1]){
                return m;
            }
            if(m > s && arr[m] < arr[m-1]){
                return m-1;
            }
            if(arr[m] == arr[s] && arr[m] == arr[e]){
                //check whether s is pivot or not
                if(s < e && arr[s] > arr[s+1]){
                    return s;
                }
                s++;
                if(s < e && arr[e] < arr[e-1]){
                    return e-1;
                }
                e--;
            }else if(arr[s] < arr[m] || arr[s] == arr[m] && arr[m] > arr[e]){
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return -1;
    }
    
    static boolean binarySearch(int[] arr,int tar,int s,int e){
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m] == tar){
                return true;
            }else if(arr[m] < tar){
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return false;
    }
}