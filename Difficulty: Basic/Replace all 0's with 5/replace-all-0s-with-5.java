class Solution {
    int convertfive(int val) {
        // Your code here
        int count = 1;
        int num = val;
        if(num == 0) return 5;
        while(num > 0){
            int temp = num%10;
            if(temp == 0){
                val += (5 * count);
            }
            num/=10;
            count *= 10;
        }
        return val;
    }
}