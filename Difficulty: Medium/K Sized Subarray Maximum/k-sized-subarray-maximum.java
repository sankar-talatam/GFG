//{ Driver Code Starts
// Initial template for JAVA

import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        // taking input using class Scanner
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            // taking total number of elements
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            int k = Integer.parseInt(br.readLine());
            ArrayList<Integer> res = new Solution().maxOfSubarrays(arr, k);

            // printing the elements of the ArrayList
            for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    public ArrayList<Integer> maxOfSubarrays(int arr[], int k) {
        // code here
        // if(k == 1) return arr;
         ArrayList<Integer> result = new ArrayList<>();
        
        if (arr.length < k) { 
            result.add(Collections.max(Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new))));
            return result;
        }
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            max = Math.max(max, arr[i]);
        }
        result.add(max);

        for (int i = k; i < arr.length; i++) {
            if (arr[i - k] == max) { 
                max = Integer.MIN_VALUE;
                for (int j = i - k + 1; j <= i; j++) {
                    max = Math.max(max, arr[j]);
                }
            } else { 
                max = Math.max(max, arr[i]);
            }
            result.add(max);
        }
        
        return result;
        
    }
}