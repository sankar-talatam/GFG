// User function Template for Java
class Solution {
    int findLength(String s) {
        // code here
        int n = s.length() - 1;
        int val = n;
        boolean found = false;
        
        for(int i = n; i >= 0 ;i--){
            if(s.charAt(i) != ' ' && !found){
                val = i;
                found = true;
            }
            else if(s.charAt(i) == ' ' && found){
                return val - i;
            }
        }
        return val + 1;
    }
}