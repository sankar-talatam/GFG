class Solution {
    public static int[] decrementArrayElements(int[] arr) {
        // Code here
        int[] fin = new int[arr.length];
        int k = 0;
        for(int i : arr){
            
            fin[k++] = i - 1;
            
        }
        return fin;
    }
}