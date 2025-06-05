// User function Template for Java

class Solution {
    public static String electionWinner(String arr[]) {
        // Your code here
        int max = -1;
        HashMap<String,Integer> hmap = new HashMap<>();
        for(String i : arr){
            hmap.put(i,hmap.getOrDefault(i,0)+1);
        }
        String maxString = "";
        for(Map.Entry<String,Integer> s : hmap.entrySet()){
            if(max <= s.getValue()){
                max = s.getValue();
                maxString = "";
                maxString+=s.getKey();
            }
        }
        return maxString;
    }
}