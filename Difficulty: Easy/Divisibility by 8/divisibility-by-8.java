class Solution {
    public boolean isDivBy8(String s) {
        // code here
        if (s.length() <= 3) {
            return (Integer.valueOf(s) % 8 == 0) ? true : false;
        } else {
            return isDivBy8(s.substring(s.length() - 3));
    }
}
}
