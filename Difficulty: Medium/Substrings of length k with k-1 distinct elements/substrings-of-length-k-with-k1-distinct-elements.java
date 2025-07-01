class Solution {
    public int substrCount(String s, int k) {
        // code here
        HashMap<Character,Integer> hmap = new HashMap<>();
        int count = 0;
        if(s.length() < k){
            return 0;
        }
        for(int i = 0 ; i < k ; i++){
            hmap.put(s.charAt(i), hmap.getOrDefault(s.charAt(i),0) + 1);
        }
        
        if(hmap.size() == k-1){
            count++;
        }
        int m = 0;
        for(int i = k; i < s.length(); i++){
            char ch = s.charAt(i);
            hmap.put(ch , hmap.getOrDefault(ch,0)+1);
            char leftCh = s.charAt(i - k);
            hmap.put(leftCh, hmap.get(leftCh)-1);
            if(hmap.get(leftCh) == 0){
                hmap.remove(leftCh);
            }
            if(hmap.size() == k - 1){
                count++;
            }
        }
        return count;
        
    }
}