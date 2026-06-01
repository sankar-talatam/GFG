class Solution {
    public int arraySum(List<Integer> arr) {
        // code here
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }
};