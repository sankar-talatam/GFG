class Solution {
    public int mean(int[] arr) {
        // code here
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum/arr.length;
    }

    public int median(int[] arr) {
        
        // code here
        Arrays.sort(arr);
        int sum = 0;
        int n = arr.length;
        if(arr.length % 2 == 0){
            sum = (arr[(n/2)]+ arr[(n/2) - 1])/2;
            
        }
        else{
            sum = arr[n/2];
        }
        return sum;
    }
}