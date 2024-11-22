int m=arr.length;
        int n=arr[0].length;
        int start=0;
        int end=(m*n)-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(arr[mid/n][mid%n]>k){
                end=mid-1;
            }
            else if(arr[mid/n][mid%n]<k){
                start=mid+1;
            }
            else{
                return true;
            }
        }
        return false;