class Solution {
    int minToggle(int[] arr) {
        // code here
        int count = 0;
        for(int i : arr){
            if(i == 0){
                count++;
            }
        }
        int countn = count;
        int minT = countn;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                countn++;
            }
            else{
                countn--;
            }
            minT = Math.min(countn,minT);
        }
        return minT;
    }
}