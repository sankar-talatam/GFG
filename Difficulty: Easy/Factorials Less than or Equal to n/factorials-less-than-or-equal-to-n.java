// User function Template for Java
class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> arList = new ArrayList<>();
        for(long i = 1 ; i <= n ; i ++){
            long p = 1;
            for(long j = i ; j >= 1 ; j--){
                p = p*j;
            }
            if(p<=n){
                arList.add(p);
            }
            else{
                break;
            }
        }
        return arList;
    }
}