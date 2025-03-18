class Solution {
    public int numIdenticalPairs(int[] arr) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int result=0;
        for (int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                result=result+mp.get(arr[i]);
            }
            mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
        }
        return result;
    }
}