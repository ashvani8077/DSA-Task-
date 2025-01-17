import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int e) {
        List<Boolean>li=new ArrayList<>();
        int max=maximum(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]+e>=max){
                li.add(true);
            }
            else{
                li.add(false);
            }
        }
        return li;
    }
    public int maximum(int arr[]){
        int max=0;
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
}