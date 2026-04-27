// User function Template for Java

class Solution {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {
        // code here
        Vector<Integer> vc = new Vector<>();
        int carry = 1;
       for(int i = arr.length-1; i >= 0; i--){
           if(arr[i] == 9 && carry == 1){
               vc.add(0);
               carry = 1;
           }
           
           else {
               vc.add(arr[i] + carry);
               carry = 0;
           }
       }
       if(carry == 1) vc.add(1);
       
      Collections.reverse(vc);
       return vc;
    }
    
}