


class Solution {
    static boolean isBalanced(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        for(char i : s.toCharArray()){
            if(i == '[' || i== '{' || i == '('){
                st.push(i);
            }
            else {
                if(!st.isEmpty() && i == ')' && st.peek()=='(' ){
                    st.pop();
                }
                else if(!st.isEmpty() && i == ']' && st.peek()=='['){
                    st.pop();
                }
                else if(!st.isEmpty() && i == '}' && st.peek()=='{'){
                    st.pop();
                }
                else{
                    st.push(i);
                }
            }
        }
        return st.isEmpty()?true:false;
    }
}
