class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
             // Code Here
        int beg=0;
        int end= arr.length-1;
        int index=-1;
        while(beg<=end){
            int mid=beg+(end-beg)/2;
           if(arr[mid]==k){
               index=mid;
               end=mid-1;
           } 
           else{
           if(k>arr[mid]){
               beg=mid+1;
           }
           else{
               end=mid-1;
           }
        }
        }
    return index;
        
    }
}