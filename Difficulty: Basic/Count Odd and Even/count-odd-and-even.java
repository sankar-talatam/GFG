class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int[] ar = new int[2];
        
        for(int i : arr){
            if(i % 2 != 0){
                ar[0] ++;
            }
            else{
                ar[1]++;
            }
            
        }
        return ar;
    }
}