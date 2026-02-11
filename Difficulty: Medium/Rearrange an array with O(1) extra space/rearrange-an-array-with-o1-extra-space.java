class Solution {
    public void arrange(long[] arr) {
        long[] arr1 = arr.clone();
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr1[(int) arr[i]];
        }
    }
}
