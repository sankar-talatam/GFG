class Solution {
    public static boolean checkPangram(String s) {
        // code here
        String newS = s.toLowerCase();
        for(char i = 'a' ; i <= 'z'; i++){
            if(!newS.contains(i+"")){
                return false;
            }
        }
        return true;
    }
}