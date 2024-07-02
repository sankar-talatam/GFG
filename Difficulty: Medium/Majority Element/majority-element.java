//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends




//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
          if(size==1){
      return a[0]; // Return the single element in the array
    }
    Arrays.sort(a);

    int maxCount = 0;
    int currentElement = a[0];
    int currentCount = 1;

    for(int i=1;i<size;i++){
      if(a[i] == currentElement){
        currentCount++;
      } else {
        // Reset count and element if count doesn't exceed half the size
        if (currentCount <= size / 2) {
          currentElement = a[i];
          currentCount = 1;
        } 
      }
    }

    // Check if final count of last element surpasses half the size
    if (currentCount > size / 2) {
      return currentElement;
    }

    return -1; // No element appears more than half the times
    }
}