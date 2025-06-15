// User function Template for Java

class Solution {
    public void segregateElements(int[] arr1) {
        // Your code goes here
        int[] arr = new int[arr1.length];
        int k = 0;
        for(int i : arr1){
            if(i >= 0){
                arr[k++] = i;
            }
        }
        for(int i : arr1){
            if(i < 0){
                arr[k++] = i;
            }
        }
        k = 0;
        for(int i : arr){
            arr1[k++] = i;
        }
    }
}