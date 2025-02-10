class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n=arr.length;
        int ans[]=new int[n-k+1];
        int m=0;
        Deque<Integer>dq=new ArrayDeque<Integer>() ;
        for(int i=0;i<n;i++){
            if(!dq.isEmpty()&&dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            while (!dq.isEmpty()&& arr[dq.peekLast()]<arr[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i>=k-1){
                ans[m++]=arr[dq.peekFirst()];
            }
        }
        return ans;
    }
}
