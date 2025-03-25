//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {
    void reverseInGroups(ArrayList<Long> arr, int k) {
        if (arr.size() == 1) {
            return;
        }
        if (k >= arr.size()) {
            Collections.reverse(arr);
            return;
        }
        
        int left = 0;
        int right = Math.min(left + k, arr.size());
        
        while (left < arr.size()) {
            ArrayList<Long> brr = new ArrayList<>(arr.subList(left, right));
            Collections.reverse(brr);
            
            for (int i = left, j = 0; i < right; i++, j++) {
                arr.set(i, brr.get(j));
            }
            
            left = left + k;
            right = Math.min(left + k, arr.size());
        }
    }
}



//{ Driver Code Starts.

public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline
        while (t-- > 0) {
            int k = sc.nextInt();
            sc.nextLine(); // consume the newline
            String input = sc.nextLine();
            ArrayList<Long> arr = new ArrayList<>();
            Scanner ss = new Scanner(input);
            while (ss.hasNextLong()) {
                arr.add(ss.nextLong());
            }
            Solution ob = new Solution();
            ob.reverseInGroups(arr, k);
            for (long num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        
System.out.println("~");
}
        sc.close();
    }
}
// } Driver Code Ends