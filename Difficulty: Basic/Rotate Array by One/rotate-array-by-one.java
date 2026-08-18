

// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        // code here
        int temp = arr[arr.length-1];
        int val = 0;
        for(int i = 0 ; i < arr.length; i++){
            val = arr[i];
            arr[i] = temp;
            temp =val;
        }
    
    }
}