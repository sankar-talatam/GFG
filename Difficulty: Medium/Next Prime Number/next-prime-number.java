class Solution {
    static boolean isPrime(int n){
        if(n <= 1) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static int nextPrime(int n) {

        // code here to find next prime number
        // return next prime number
        int i = n + 1;
        while(!isPrime(i)){
            i++;
        }
        return i;
    }
}