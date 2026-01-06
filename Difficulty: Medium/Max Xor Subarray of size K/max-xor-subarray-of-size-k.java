class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int max = 0;
        int currmax = 0;
        
        for(int i = 0; i < k; i++){
            currmax ^= arr[i];
        }
        
        max = Math.max(max,currmax);
        
        for(int i = k ; i < arr.length; i++){
            currmax ^= arr[i-k];
            currmax ^= arr[i];
            max = Math.max(currmax , max);
        }
        return max;
    }
}
