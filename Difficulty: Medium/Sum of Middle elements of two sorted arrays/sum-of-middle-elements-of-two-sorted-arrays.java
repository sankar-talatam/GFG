//{ Driver Code Starts
// Initial Template for Java

import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {
    public int SumofMiddleElements(int[] arr1, int[] arr2) {
        // code here
        int[] arr = new int[2*arr1.length];
        int left = 0 ; 
        int right =arr.length-1;
        int k = 0;
        int m = arr2.length-1;
        while(left<right){
            arr[left++] = arr1[k];
            arr[right--] = arr2[k];
            k++;
        }
        Arrays.sort(arr);
        int avg = ((arr[arr.length/2]) + (arr[arr.length/2-1]));
        return avg;
    }
}


//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline
        while (t-- > 0) {
            String[] input1 = sc.nextLine().split(" ");
            int[] arr = new int[input1.length];
            for (int i = 0; i < input1.length; i++) {
                arr[i] = Integer.parseInt(input1[i]);
            }

            String[] input2 = sc.nextLine().split(" ");
            int[] brr = new int[input2.length];
            for (int i = 0; i < input2.length; i++) {
                brr[i] = Integer.parseInt(input2[i]);
            }

            Solution ob = new Solution();
            int res = ob.SumofMiddleElements(arr, brr);
            System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends