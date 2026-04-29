class Solution {
    public int minSwaps(int[] arr) {
        int count = 0;
        for(int i : arr){
            if(i == 1){
                count++;
            }
        }
        if(count == 0) return -1;

        int countF = 0;
        for(int i = 0; i < count; i++){
            if(arr[i] == 0){
                countF++;
            }
        }

        int min = countF;

        for(int i = count; i < arr.length; i++){
            if(arr[i - count] == 0){
                countF--;
            }
            if(arr[i] == 0){
                countF++;
            }
            min = Math.min(min, countF);
        }

        return min;
    }
}