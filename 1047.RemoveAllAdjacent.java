class Solution {
    public String removeDuplicates(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Character>st=new Stack<>();
        for (int i=0;i<s.length();i++){
            if(!st.empty()&&st.peek()==s.charAt(i)){
                st.pop();
            }
            else {
                st.push(s.charAt(i));
            }
        }

        while (!st.empty()){
            res.append(st.peek());
            st.pop();
        }
        return res.reverse().toString();
    }
}
