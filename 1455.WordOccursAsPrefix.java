class Solution {
    public int isPrefixOfWord(String str, String k) {
        String arr[]=str.split(" ");
        for(int i=0;i<arr.length;i++){
            String temp=arr[i];
            if(temp.startsWith(k)){
                return i+1;
            }
        }
        return -1;
    }
}