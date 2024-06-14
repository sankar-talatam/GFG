//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    public static String isArm(int m)
    {
        int t=0,c=0,s=0;
        t=m;
        while(t!=0)
        {
            c++;
            t=t/10;
        }
        t=m;
        while(t!=0){
            int tep=t%10;
            s=s+(int)Math.pow(tep,c);
            t=t/10;
            
        }
        if(s==m)
        {
            return "Yes";
        }
        else
        return "No";
    }
    static String armstrongNumber(int n){
        // code here
        return isArm(n);
    }
}