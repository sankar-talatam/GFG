/*Complete the function below*/

class Solution {
    // Function to find triplets with zero sum.
    public boolean findTriplets(int[] arr) {
        // code here.
        for(int i = 0 ; i < arr.length; i++){
            for(int j = i+1 ; j < arr.length; j++){
                for(int k = j+1; k < arr.length ; k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        return true;
                    }
                }
            }
            
        }
        return false;
    }
}