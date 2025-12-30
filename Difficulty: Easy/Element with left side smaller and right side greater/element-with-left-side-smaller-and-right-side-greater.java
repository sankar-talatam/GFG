class Solution {
    public int findElement(int[] arr) {
        // code here
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        
        left[0] = arr[0];
        for(int i = 1 ; i < n; i++){
            left[i] = Math.max(left[i-1],arr[i]);
        }
        
        right[n-1] = arr[n - 1];
        for(int j = n-2; j >= 0; j--){
            right[j] = Math.min(right[j+1] , arr[j]);
        }
        
        for(int i = 1 ; i < n-1; i++){
            if(left[i-1] <= arr[i] && right[i+1] >= arr[i])
            {
                return arr[i];
            }
        }
        return -1;
    }
}
