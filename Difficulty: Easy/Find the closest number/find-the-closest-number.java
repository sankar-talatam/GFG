
class Solution {
    public static int findClosest(int[] arr, int target) {
        // code here
        int min = Integer.MAX_VALUE;
        int minE = 0;
        for(int i = arr.length- 1; i >=0 ; i--){
            if(min > Math.abs(arr[i] - target)){
                min =  Math.abs(arr[i] - target);
                minE = arr[i];
            }
        }
        return minE;
    }
}
