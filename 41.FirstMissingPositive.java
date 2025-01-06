class Solution {
    public int firstMissingPositive(int[] arr) {
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        int j=1;
        while(true){
            if(hs.contains(j)){
                j++;
            }
            else{
                return j;
            }
        }
    }
}