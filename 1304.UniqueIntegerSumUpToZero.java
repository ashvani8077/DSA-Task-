class Solution {
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        if(n%2!=0){
            int mid=n/2;
            arr[mid]=0;
            int a=-1;
            for(int i=mid-1;i>=0;i--){
                arr[i]=a;
                a=a+(-1);
            }
            a=1;
            for(int i=mid+1;i<n;i++){
                arr[i]=a;
                a=a+1;
            }
        }
        else{
            int mid=(n/2)-1;
            int a=-1;
            for(int i=mid;i>=0;i--){
                arr[i]=a;
                a=a+(-1);
            }
            a=1;
            for(int i=mid+1;i<n;i++){
                arr[i]=a;
                a=a+1;
            }
        }
        return arr;
    }
}