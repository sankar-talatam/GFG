/*Complete the Function below*/
class Solution {
    static boolean ispalin(String s){
        
        for(int i = 0; i < s.length()/2;i++){
            if(s.charAt(i)!= s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        for(int i = 0; i < arr.length; i++){
            String s = "";
            s += arr[i];
            if(!ispalin(s)){
                return false;
            }
        }
        return true;
    }
}