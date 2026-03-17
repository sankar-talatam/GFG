class Solution {
    public static boolean prime(int n) {
        // Write your code here
        if(n == 2 || n == 3) return true;
        if(n < 5) return false;
        
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}