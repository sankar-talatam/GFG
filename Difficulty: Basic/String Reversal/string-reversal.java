//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String s = br.readLine();
                    Solution ob = new Solution();
                    System.out.println(ob.reverseString(s));
                }
        }
}
// } Driver Code Ends




//User function Template for Java

class Solution
{
    public String reverseString(String s)
    {
        //code here.
        ArrayList<Character> arr=new ArrayList<>();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(!arr.contains(s.charAt(i)) && Character.isAlphabetic(s.charAt(i)))
            {
                arr.add(s.charAt(i));
            }
        }
        
        String S="";
        for(char ch:arr)
        {
            S+=ch;

        }
        return S;
    }
}