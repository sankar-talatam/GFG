class Solution {
    public int countOnes(int[] arr) {
        // code here
        int count = 0;
        
        for(int i : arr) if(i == 1) count++;
        return count;
    }
}