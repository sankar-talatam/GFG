// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        int i = 0;
        int j = m - 1;
        int min = Integer.MAX_VALUE;
        Collections.sort(arr);
        while(j < arr.size()){
            int mini = arr.get(j) - arr.get(i);
            min = Math.min(min,mini);
            i++;
            j++;
        }
        
        return min;
    }
}