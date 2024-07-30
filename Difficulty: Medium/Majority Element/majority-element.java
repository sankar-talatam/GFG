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
class Solution {
    static boolean isMajority(int arr[], int size, int candidate) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }
        return count > size / 2;
    }
    static int majorityElement(int arr[], int size) {
        int candidate = findCandidate(arr, size);
        if (isMajority(arr, size, candidate)) {
            return candidate;
        } else {
            return -1;
        }
    }

    static int findCandidate(int arr[], int size) {
        int count = 0, candidate = -1;
        for (int i = 0; i < size; i++) {
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            } else if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}