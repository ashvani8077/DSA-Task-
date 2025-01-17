class Solution {
    public int[] smallerNumbersThanCurrent(int[] arr) {
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(i!=j&&arr[i]>arr[j]){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}