//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG{
	public static void main(String [] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			int N = sc.nextInt();
			Solution obj = new Solution();
			obj.toBinary(N);
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	void toBinary(int N) {
		//Write your code here
	    ArrayList<Character> arr=new ArrayList<>();
		while(N!=0)
		{
		    if(N%2==0)
		    {
		        arr.add('0');
		        N=N/2;
		    }
		    else
		    {
		        arr.add('1');
		        N=N/2;
		    }
		}
		int n=arr.size();
		for(int i=n-1;i>=0;i--)
		{
		    System.out.print(arr.get(i));
		}
	    
	}
}