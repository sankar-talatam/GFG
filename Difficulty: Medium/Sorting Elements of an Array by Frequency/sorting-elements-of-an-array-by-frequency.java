//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Map.Entry;


// } Driver Code Ends
// User function Template for Java

class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int freqarr[]) {
        // add your code here
        // int freqarr[]= new int[]{5,5,4,6,4};
            Arrays.sort(freqarr);
            LinkedHashMap<Integer, Integer> freqMap = new LinkedHashMap<>();
            for ( int ele :freqarr) {
                freqMap.put(ele, freqMap.getOrDefault(ele, 0) + 1);
            }
            List<Map.Entry<Integer,Integer>>  sortinglist = new ArrayList<>(freqMap.entrySet());
            sortinglist.sort((a,b)-> b.getValue().compareTo(a.getValue()));
        // System.out.println(freqMap);
        // System.out.println(sortinglist);
            ArrayList<Integer> ans = new ArrayList<>();
            for ( var ele :sortinglist){
                int temp=ele.getValue();
                while(temp-- > 0 ){
                    // System.out.println(ele.getKey() +" "+ ele.getValue());
                    ans.add(ele.getKey());
                }
            }
       return ans;
    }
}

//{ Driver Code Starts.

class Driverclass {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        while (n != 0) {
            String input = sc.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            ArrayList<Integer> ans = new ArrayList<Integer>();
            ans = new Solution().sortByFreq(arr);
            for (int i = 0; i < ans.size(); i++) System.out.print(ans.get(i) + " ");
            System.out.println();
            n--;
        }
    }
}

// } Driver Code Ends