

class Solution {

    public int peakElement(int[] arr) {
        // code here
         int max=0,x=0;
       for(int i =0; i <arr.length;i++)
       {
           if(max<arr[i])
           {
               max=arr[i];
               x=i;
           }
           
       }
       return x;
    }
}
