//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            Solution ob = new Solution();
            int[] ans = ob.getFloorAndCeil(x, arr);
            System.out.println(ans[0] + " " + ans[1]);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        int c=0,d=0;
        int n = arr.length;
        int[] newArr = new int[2];
        for(int i = n-1 ; i >= 0 ; i--){
            if(arr[i]<=x){
                newArr[0]=arr[i];
                c++;
                break;
            }
            
        }
        for(int i = 0 ; i < n ; i++){
            if(arr[i]>=x){
                newArr[1]=arr[i];
                d++;
                break;
            }
            
        }
        if(c==0) newArr[0]=-1;
        if(d==0) newArr[1]=-1;
        return newArr;
    }
}
