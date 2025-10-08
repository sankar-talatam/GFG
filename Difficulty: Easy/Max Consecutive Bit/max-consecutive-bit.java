class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int count0 = 0;
        int count1 = 0;
        int maxCount = 0;
        for(int i : arr){
            if(i == 0){
                count0++;
            }
            else{
                maxCount = Math.max(maxCount,count0);
                count0 = 0;
            }
        }
        for(int i : arr){
            if(i == 1){
                count1++;
            }
            else{
                maxCount = Math.max(maxCount,count1);
                count1 = 0;
            }
        }
        maxCount = Math.max(maxCount,count1);
        maxCount = Math.max(maxCount,count0);
        return maxCount;
    }
}
