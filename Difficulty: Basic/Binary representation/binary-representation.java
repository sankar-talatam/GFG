//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();

            Solution ob = new Solution();
            String ans = ob.getBinaryRep(N);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String getBinaryRep(int N){
        // code here
        String str  = "";
        while(N>0){
            int temp = N%2;
            str+=temp;
            N/=2;
        }
        String str1 = "";
        for(int i = str.length()-1;i>=0;i--){
            str1+=str.charAt(i);
        }
        
        int n = str.length();
        int val = 30-n;
        String str2="";
        int val2=0;
        for(int i = 0 ; i < val ; i++){
            str2+=0;
            val2 = i;
        }
        for(int i = 0 ; i<str.length();i++){
            str2+=str1.charAt(i);
        }
        return str2;
        
    }
}