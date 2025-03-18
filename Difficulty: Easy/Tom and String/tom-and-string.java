//{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends

class Solution {
    static long hashString(String s) {

        // Code Here
        String st= "abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        HashMap<Character,Integer> hmap = new HashMap<>();
        int k = 0;
        for(char i : st.toCharArray()){
            hmap.put(i,k++);
        }
        String[] arr = s.split(" ");
        int mainSum = 0;
        for(String i : arr){
           
            int sum = 0;
            for(int j = 0 ; j < i.length(); j++){
                sum+= (j+ hmap.get(i.charAt(j)));
            }
            mainSum += sum;
        }
        return arr.length* mainSum;
    }
};


//{ Driver Code Starts.
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.hashString(s));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends