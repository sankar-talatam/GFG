//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {

    /*  Function to calculate the longest consecutive ones
     *   N: given input to calculate the longest consecutive ones
     */
    public static int maxConsecutiveOnes(int N) {

        // Your code here
        int n = 1;
        int max = -1;
        int c = 0;
        for(int i = 0;i<32;i++){
            if((N & (1 << i)) != 0){
                c++;
                max = Math.max(max,c);
            }
            else{
                
                c = 0;
            }
        }
        return max;
        
    }
}



//{ Driver Code Starts.

class Main {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//input n
		    
		    Solution obj = new Solution();
		    
		    //calling maxConsecutiveOnes() function
		    System.out.println(obj.maxConsecutiveOnes(n));
		
System.out.println("~");
}
	}
}



// } Driver Code Ends