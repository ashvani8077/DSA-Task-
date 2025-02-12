class Solution {
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>>l=new ArrayList<>();
        List<Integer>li=new ArrayList<>();
        int n=arr.length;
        HashSet<Integer>hs=new HashSet<>();
        solve(l,li,n,hs,arr);
        return l;

    }

    public static void solve(List<List<Integer>>l,List<Integer>li,int n,HashSet<Integer>hs,int arr[]){
        if(li.size()==n){
            l.add(new ArrayList<>(li));
            return;
        }

        for (int i=0;i<n;i++){
            if(!hs.contains(arr[i])){
                li.add(arr[i]);
                hs.add(arr[i]);
                solve(l,li,n,hs,arr);
                li.remove(li.size()-1);
                hs.remove(arr[i]);
            }
        }
    }
}
