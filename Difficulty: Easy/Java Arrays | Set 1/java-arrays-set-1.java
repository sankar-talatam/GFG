
class Solution {
    public String average(int nums[]) {
        // code here
        int n = nums.length;
        int sum  = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
         double avg = (double) sum/n;
             return String.format("%.2f",avg);
    }
}