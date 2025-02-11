//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.decToBinary(n));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    static String decToBinary(int n) {
        // code here
        String str = "";
        while(n>0){
            int temp = n%2;
            str+= temp;
            n/=2;
        }
        String str1 = "";
        for(int i = str.length()-1 ; i>=0;i--){
            str1+=str.charAt(i);
        }  
        return str1;
    }
}