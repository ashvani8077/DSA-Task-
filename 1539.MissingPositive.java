class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l=0;
        int r=arr.length-1;
        int mid=-1;
        while (l<=r){
            mid=(l+r)/2;
            int kitne_bache=arr[mid]-(mid+1);
            if(kitne_bache<k){
                l=mid+1;
            }
            else {
                r=mid-1;
            }
        }
        return l+k;
    }
}