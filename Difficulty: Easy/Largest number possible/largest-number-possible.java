// User function Template for Java

class Solution {
    static String findLargest(int n, int s) {
        // code here
        if (s == 0) {
            if (n == 1) return "0";
            else return "-1";
        }
        if(s > 9 * n) return "-1";
        
        String st = "";
        for(int i = 0; i < n; i++){
            if(s >= 9){
                st += 9;
                s -= 9;
            }
            else{
                st += s;
                s = 0;
            }
        }
        return st;
    }
}