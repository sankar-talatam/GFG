class Solution {
    public int coin(int[] arr) {
        // code here
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            if(arr[left] < arr[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return arr[left];
    }
}