class Solution {
    public int[] searchRange(int[] arr, int k) {
        int ans[]=new int[2];
        ans[0]=firstIndex(arr,k);
        ans[1]=lastIndex(arr,k);
        return ans;
        
    }


     public static int firstIndex(int arr[], int k){
        int ans=-1;
        int low=0;
        int high= arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid]<k){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return ans;
    }

    public static int lastIndex(int arr[], int k){
        int ans=-1;
        int low=0;
        int high= arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                ans=mid;
                low=mid+1;
            }
            else if(arr[mid]>k){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;
    }


}