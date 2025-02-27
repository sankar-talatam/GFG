//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {

            String input[] = read.readLine().split(" ");
            String a = input[0];

            Solution ob = new Solution();
            if (ob.sameFreq(a)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
// } Driver Code Ends



class Solution {
    boolean sameFreq(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        
        HashMap<Integer, Integer> freqCount = new HashMap<>();
        for (int freq : freqMap.values()) {
            freqCount.put(freq, freqCount.getOrDefault(freq, 0) + 1);
        }
        
        if (freqCount.size() == 1) {
            return true;
        }
        
        if (freqCount.size() > 2) {
            return false;
        }

        int[] keys = new int[2];
        int idx = 0;
    
        for (int key : freqCount.keySet()) {
            keys[idx++] = key;
        }

        int freq1 = keys[0], freq2 = keys[1];

        if ((freq1 == 1 && freqCount.get(freq1) == 1) || (freq2 == 1 && freqCount.get(freq2) == 1)) {
            return true;
        }

        if ((freq1 == freq2 + 1 && freqCount.get(freq1) == 1) || 
            (freq2 == freq1 + 1 && freqCount.get(freq2) == 1)) {
            return true;
        }

        return false;
    }
}
