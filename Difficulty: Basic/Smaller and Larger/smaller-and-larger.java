// User function Template for Java

class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        // code here
        int countL = 0, countR = 0;
        for(int i: arr){
            if(i <= target){
                countL++;
            }
            if(i >= target){
                countR++;
            }
        }
        int[] newA = new int[2];
        newA[0] = countL;
        newA[1] = countR;
        return newA;
    }
}