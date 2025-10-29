class Solution {
    public boolean isValid(String s) {
        String newS = "";
        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                if (newS.equals("")) return false;
                int num = Integer.parseInt(newS);
                if (num < 0 || num > 255) return false;
                if (newS.length() > 1 && newS.charAt(0) == '0') return false;
                newS = "";
                c++;
            } else {
                if (!Character.isDigit(s.charAt(i))) return false;
                newS += s.charAt(i);
            }
        }

        if (newS.equals("")) return false;
        int num = Integer.parseInt(newS);
        if (num < 0 || num > 255) return false;
        if (newS.length() > 1 && newS.charAt(0) == '0') return false;

        if (c != 3) return false;
        return true;
    }
}
