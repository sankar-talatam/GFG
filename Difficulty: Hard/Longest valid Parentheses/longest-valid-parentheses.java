//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String S = in.readLine();

            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends

    

class Solution {
    static int maxLength(String s) {
        // code here
        Stack<Integer> st = new Stack<>();
        int max = 0;
        st.push(-1);
        for(int j =0 ; j < s.length();j++){
            int i = s.charAt(j);
            if(i == '('){
                st.push(j);
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(j);
                }
                else{
                    max = Math.max(max,j-st.peek());
                }
            }
        }
        return max;
    }
}