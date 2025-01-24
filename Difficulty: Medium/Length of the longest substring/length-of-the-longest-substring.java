//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubstring(s));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int longestUniqueSubstring(String s) {
        // code here
        int left = 0 ; 
        int right = 0 ; 
        int max = 0 ;
        HashSet<Character> set = new HashSet<>();
        while(right < s.length())
        {
            if(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            else{
                set.add(s.charAt(right));
                right++;
                max = Math.max(max , right-left);
            }
            
        }
        return max;
    }
}