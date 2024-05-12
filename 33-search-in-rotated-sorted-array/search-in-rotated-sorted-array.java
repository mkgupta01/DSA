class Solution {
    public int search(int[] nums, int target) {
        int ans;
        if(nums[0] == target){
            return 0;
        }
        if(nums[0] < nums[nums.length-1]){
            // if array is not rotated perform normal binary seacrh wthout finding the pivot
            return BinarySearch(nums,target,0,nums.length-1);      
        }
        
        int pivot_Index = findPivotIndex(nums);
        if(target >= nums[0]){
            ans = BinarySearch(nums,target,0,pivot_Index);
        }else{
            ans = BinarySearch(nums,target,pivot_Index+1,nums.length-1);
        }
        return ans;
    }
    
    static int findPivotIndex(int[] arr){
        int s=0,e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            //4 case goes here
            if(m < e && arr[m] > arr[m+1]){
                return m;
            }else if(m > s && arr[m] < arr[m-1]){
                return m-1;
            }else if(arr[m] >= arr[s]){
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return -1;
    }
    
    static int BinarySearch(int[] arr,int target,int start,int end){
        while(start <= end){
            int mid=start+(end-start)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}