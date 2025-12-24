class Solution {
    public int countLessEqual(int[] arr, int x) {
        // code here
        Arrays.sort(arr);
        int sum = 0;
        int count = 0;
        
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] > x){
                count++;
            }
            else{
                break;
            }
        }
        return arr.length - count;
    
    }
}
