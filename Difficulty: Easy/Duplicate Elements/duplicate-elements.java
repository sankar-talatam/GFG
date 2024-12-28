//{ Driver Code Starts
//Initial Template for Java
import java.util.*;

class GFG 
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i = 0; i < n; i++)
		     arr[i] = sc.nextInt();
		     
		    Geeks obj = new Geeks();
		    obj.SortedDuplicates(arr, n);
		    System.out.println();  // print the newline
		    
		
System.out.println("~");
}
	}
}




// } Driver Code Ends
//User function Template for Java

/* Helper class containing function SortedDuplicates
containg arguments
arr[]: the duplicated array
n: size of the array
*/
class Geeks
{
    // print the elements which appear more than
    // once in the array in sorted order
    public static void SortedDuplicates(int arr[], int n)
    {
        //Your code here
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> ar  = new ArrayList<>();
        for(int i : arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
         for(Map.Entry<Integer,Integer> i : hm.entrySet()){
            if(i.getValue()>1)
            {
                
                ar.add(i.getKey());
            }
        }
        Collections.sort(ar);
        if(ar.isEmpty()){
            System.out.print(-1);
        }
        else{
        for(int i : ar){
            System.out.print(i+" ");
        }
        }
    
}}
   

//{ Driver Code Starts.

// } Driver Code Ends