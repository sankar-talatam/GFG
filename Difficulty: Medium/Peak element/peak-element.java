class Solution {
    public int peakElement(int[] arr) {
        // code here
// brute force approach
//         int n =  arr.length;    
//     if(n==1) return 0;
//     if(arr[0]>arr[1]) return 0;
//          for(int i = 1;i< n-1;i++){
//         if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
//             return i;
// }

// }
//     if(arr[n-1] >arr[n-2]) return n-1;
//     return -1;

// Binary Search approach 
    int l = 0; 
    int h = arr.length-1;
        while (l<h){
            int m = (h+l)/2;
            if(arr[m]<arr[m+1]){
                l = m+1;// move towards the right side
            }else{
                h = m; // move towards the left side 
            }
        //if l == h
        //then return the l(low)
    }return l;
        
    }
}