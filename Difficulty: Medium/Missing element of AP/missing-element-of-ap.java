//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());

        Solution solution = new Solution();
        while (t-- > 0) {
            String input = reader.readLine().trim();
            String[] parts = input.split("\\s+");
            int[] arr = Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();

            System.out.println(solution.findMissing(arr));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findMissing(int[] arr) {
        // code here
        boolean boolval = false;
        if(arr[0]>arr[arr.length-1]){
            boolval = true;
        }
        Arrays.sort(arr);
        int k = Math.min((arr[1]-arr[0]),(arr[arr.length-1]-arr[arr.length-2]));
          int val = arr[0];
        for(int i = 0 ; i < arr.length; i++){
            if(val!=arr[i]){
                return val;
            }
            val+=k;
        }
        return boolval?arr[0]-k:arr[arr.length-1]+k;
    }
}
