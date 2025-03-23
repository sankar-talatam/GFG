//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine();

            Solution ob = new Solution();
             
            System.out.println(ob.getCrazy(S));
        }
    } 
} 


// } Driver Code Ends


//User function Template for Java

class Solution{
    static String getCrazy(String s)
    {
        //Your code here
        boolean c = false;
        if(Character.isUpperCase(s.charAt(0))){
            c = true;
        }
        int val = 0;
        String st = "";
        for(int i = 0 ; i < s.length();i++){
            if(c){
                st+= (i%2==0 ?Character.toUpperCase(s.charAt(i)):Character.toLowerCase(s.charAt(i)));
            }
            else{
                st+= (i%2==0 ?Character.toLowerCase(s.charAt(i)):Character.toUpperCase(s.charAt(i)));
            }
        }
        return st;
    }
    
    
}