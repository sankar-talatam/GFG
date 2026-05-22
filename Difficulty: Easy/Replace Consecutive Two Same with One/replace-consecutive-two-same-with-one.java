class Solution {
    public String removeDuplicates(String s) {
        StringBuilder st = new StringBuilder();

        st.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                st.append(s.charAt(i));
            }
        }

        return st.toString();
    }
}