//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.util.*;


// } Driver Code Ends

class Solution {
    public String maximumFrequency(String str) {
        String[] words = str.split("\\s+"); // Split by one or more spaces
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
        
        for (String word : words) {
            hm.put(word, hm.getOrDefault(word, 0) + 1);
        }

        int max = 0;
        String maxWord = "";

        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxWord = entry.getKey();
            }
        }

        return maxWord + " " + max;
    }
}

//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character after the integer input

        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            Solution sol = new Solution();
            System.out.println(sol.maximumFrequency(str));
            System.out.println("~");
        }

        sc.close();
    }
}

// } Driver Code Ends