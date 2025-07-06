

class Solution {
int maxSubarraySum(int[] arr) {
        // Your code here
         int  cs=0, ts=arr[0];
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
             if(cs>ts){
                ts=cs;
              }
            if(cs<0){
                cs=0;
            }
            
          }
        
        return ts;
    }
}
