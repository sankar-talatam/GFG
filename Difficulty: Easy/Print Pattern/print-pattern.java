//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine().trim());
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.pattern(N);
            for(int i = 0;i < ans.size();i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public void addin(int N , List<Integer>list){
        list.add(N);
        if(N>0){
            addin(N-5,list);
        }
        if(N>0){
            list.add(N);
        }
        
    }
    public List<Integer> pattern(int N){
        // code hee
        List<Integer> list = new ArrayList<>();
        addin(N,list);
        return list;
        
    }
}