class Solution {
    public int[] nextGreaterElement(int[] arr1, int[] arr2) {
        int result[]=new int[arr1.length];
        HashMap<Integer, Integer>mp=new HashMap<>();
        Stack<Integer>st=new Stack<>();
        for (int i:arr2){
            while (!st.empty()&&st.peek()<i){
                mp.put(st.pop(),i);
            }
            st.push(i);
        }
        for(int i=0;i<arr1.length;i++){
            result[i]=(mp.getOrDefault(arr1[i],-1));
        }
        return result;
    }
}