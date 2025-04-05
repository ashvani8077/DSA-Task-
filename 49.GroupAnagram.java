class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        
         HashMap<String,List<String>>mp=new HashMap<>();
        for(String temp:str){
            char []charArray=temp.toCharArray();
            Arrays.sort(charArray);
            String sortedStr=new String(charArray);
            if(!mp.containsKey(sortedStr)){
                mp.put(sortedStr,new ArrayList<>());
            }
            mp.get(sortedStr).add(temp);
        }
        return new ArrayList<>(mp.values());
    }
}