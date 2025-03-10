//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            String ans = ob.longestCommonPrefix(arr);

            if (ans.isEmpty()) {
                System.out.print("\"\"");
            } else {
                System.out.print(ans);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        StringBuilder sb = new StringBuilder(arr[0]);
        for(int i = 1 ; i < arr.length ; i++){
            String s2 = arr[i];
            String s = "";
            int k = 0;
            int min = Math.min(sb.length(),s2.length());
            while(k < min){
                if(s2.charAt(k) != sb.charAt(k)){
                    break;
                }
                else{
                    s+=s2.charAt(k);
                }
                k++;
            }
            sb.setLength(0);
            sb.append(s);
            
        }
        return sb.toString();
    }
}