class Solution {
    public boolean isPalin(String bin){
        for(int i = 0; i < bin.length(); i++){
            if(bin.charAt(i) != bin.charAt(bin.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
    public boolean isBinaryPalindrome(int n) {
        // code here
        String bin = Integer.toBinaryString(n);
        return isPalin(bin);
        
    }
};