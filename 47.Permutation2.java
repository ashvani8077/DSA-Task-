class Solution {
    public List<List<Integer>> permuteUnique(int[] arr) {
        int n=arr.length;
        List<List<Integer>>l=new ArrayList<>();
        List<Integer>li=new ArrayList<>();
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
        }
        solve(l,li,mp,n);
        return l;
    }

    public static void solve(List<List<Integer>>l, List<Integer>li, HashMap<Integer,Integer>mp, int n){
        if(li.size()==n){
            l.add(new ArrayList<>(li));
            return;
        }
        for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
            if(entry.getValue()>0){
                li.add(entry.getKey());
                entry.setValue(entry.getValue()-1);
                solve(l,li,mp,n);
                li.remove(li.size()-1);
                entry.setValue(entry.getValue()+1);
            }
        }
    }
}
