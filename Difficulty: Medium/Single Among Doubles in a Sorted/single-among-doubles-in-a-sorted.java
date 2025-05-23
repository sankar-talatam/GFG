// User function Template for Java

class Solution {
    int findOnce(int[] arr) {
        // Complete this function
        int c = 0;
        if(arr.length == 1) return arr[0];
        for(int i = 0 ; i < arr.length-1; i++){
            if(c == 0 && arr[i]!=arr[i+1] ){
                return arr[i];
            }
            else if(c!=0 && arr[i]!=arr[i+1] && i == arr.length-2){
                return arr[i+1];
            }
            else if(c!=0 && arr[i]!=arr[i+1]) {
                c = 0;
            }
            else{
                c++;
            }
        }
        return -1;
    }
}