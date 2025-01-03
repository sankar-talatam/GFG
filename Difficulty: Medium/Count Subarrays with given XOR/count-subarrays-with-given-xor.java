//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            String s[] = br.readLine().split(" ");
            int arr[] = new int[s.length];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            int k = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            System.out.println(obj.subarrayXor(arr, k));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        int c = 0;
        int sum = 0 ;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            sum = sum ^ (arr[i]);
                if(sum == k){
                    c++;
                }
                int target = sum ^ k;
                if(hm.containsKey(target)){
                    c+= hm.get(target);
                }
                hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return c;
    }
}