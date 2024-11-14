class Solution {
    public List<List<Integer>> threeSum(int[]arr) {
        Arrays.sort(arr);
        HashSet<List<Integer>>li=new HashSet<>();
        for(int i=0;i<arr.length-2;i++){
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==0&&(i!=j&&j!=k)){
                    List<Integer>ans=new ArrayList<>();
                    ans.add(arr[i]);
                    ans.add(arr[j]);
                    ans.add(arr[k]);
                    j++;
                    k--;
                    li.add(ans);
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        List<List<Integer>>list=new ArrayList<>(li);
        return list;
    }
}