class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int st=1;
        int en=1000000;
        int ans=-1;
        while(st<=en){
            int mid=(st+en)/2;
            int pre=getResult(nums,mid);
            if(pre<=threshold){
                ans=mid;
                en=mid-1;
            }else{
             st=mid+1;
            }
        }
        return ans;
    }

    int getResult(int[] nums, int divisor){
        int ans=0;
        for(int i=0;i<nums.length;i++){
          
            int pre = (nums[i]/divisor);
         
            if(pre*divisor<nums[i]){
                pre++;
            }
            ans+= pre;
            // System.out.println(pre);
        }
        return ans;
    }
}