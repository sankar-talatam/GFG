//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while(testCase-- > 0)
        {
            String data = br.readLine();
            Solution obj = new Solution();
            System.out.println(obj.isIsogram(data)?"1":"0");
            
        
System.out.println("~");
}
	 }
}
// } Driver Code Ends





class Solution
{
    //Function to check if a string is Isogram or not.
    static boolean isIsogram(String data){
        //Your code here
        HashMap<Character,Integer> hmap = new HashMap<>();
        for(char i : data.toCharArray()){
            hmap.put(i,hmap.getOrDefault(i,0)+1);
        }
        for(int i : hmap.values()){
            if(i>1) return false;
        }
        return true;
    }
}