class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int current=0;
        for(int i:gain){
            current=current+i;
            max=Math.max(max,current);
        }
        return max;
    }
}