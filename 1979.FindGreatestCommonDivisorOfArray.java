class Solution {
    public int findGCD(int[] arr) {
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        int min=arr[0];
        int ans=gcd(max,min);
        return ans;
    }
    public static int gcd(int max,int min){
        if(min==0){
            return max;
        }
        return gcd(min,max%min);
    }
}