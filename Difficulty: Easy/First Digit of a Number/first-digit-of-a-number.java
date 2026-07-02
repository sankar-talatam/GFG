class Solution {
    public static int firstDigit(int n) {
        // code here
        String s = "" + n;
        return (s.charAt(0)) - '0';
    }
}