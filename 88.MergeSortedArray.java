class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int k=0;
        for(int i=m;i<m+n;i++){
            arr1[i]=arr2[k];
            k++;
        }
        Arrays.sort(arr1);
    }

}