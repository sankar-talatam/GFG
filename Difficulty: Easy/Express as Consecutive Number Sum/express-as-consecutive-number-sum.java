class Solution {
    public boolean isSumOfConsecutive(int n) {
        // code herei
        return (n & (n - 1)) == 0?false:true;
    }
}