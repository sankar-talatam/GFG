class Solution {
    public int sumSubMins(int[] arr) {
        // code here
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        for(int i = 0 ; i < arr.length; i++){
            int min = arr[i];
            for(int j = i + 1 ; j < arr.length; j++){
                min = Math.min(min,arr[j]);
                sum += min;
            }
        }
        return sum;
    }
}
