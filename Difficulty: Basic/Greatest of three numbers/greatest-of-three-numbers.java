class Solution {
    public int greatestOfThree(int a, int b, int c) {
        // code here
        if(a > b && a > c) return a;
        if(b > a && b > c) return b;
        if(a == b && a > c) return a;
        if(b==c && b > a) return b;
        return c;
    }
}
