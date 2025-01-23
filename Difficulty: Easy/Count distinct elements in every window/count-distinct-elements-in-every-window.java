//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.HashMap;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            ArrayList<Integer> array = new ArrayList<>();

            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int k = Integer.parseInt(br.readLine());

            ArrayList<Integer> ans = new Solution().countDistinct(arr, k);

            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();

            t--;
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> values = new ArrayList<>();
        for(int i = 0 ; i < k ; i ++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            
        }
        values.add(hm.size());
        for(int i = k ; i < arr.length; i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            hm.put(arr[i-k],hm.get(arr[i-k])-1);
            int val = hm.get(arr[i-k]); 
            if(val == 0){
                hm.remove(arr[i-k]);
            }
            values.add(hm.size());
        }
        return values;
    }
}
