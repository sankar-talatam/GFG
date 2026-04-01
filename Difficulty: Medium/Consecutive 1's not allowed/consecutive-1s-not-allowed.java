class Solution {
    int countStrings(int n) {
        // code here
        int f = 2;
        if(n == 1) return f;
        int s = 3;
        if(n == 2) return s;
        int next = 0;
        for(int i = 0; i < n - 2; i++){
            next = f + s;
            f = s;
            s = next;
        }
        return next;
    }
}