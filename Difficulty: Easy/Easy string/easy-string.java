//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String s = read.readLine();
            Solution ob = new Solution();
            String ans = ob.transform(s);
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String transform(String S) 
    {
        // code here
        String newS=S.toLowerCase();
        StringBuilder SB=new StringBuilder();
        int c=1;
        for(int i=0;i<S.length()-1;i++)
        {
            if(newS.charAt(i)==newS.charAt(i+1)){
                c++;
            }
            else{
                SB.append(c+""+newS.charAt(i));
                c=1;
            }
        }
        SB.append(c);
        SB.append(newS.charAt(newS.length()-1));
        return SB.toString();
    }
} 