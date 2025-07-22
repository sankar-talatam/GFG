class Solution {
    public int missingNumber(int[] arr) {
        // code here
        Set<Integer> hset = new HashSet<>();
        for(int i : arr){
            if(i > 0){
                hset.add(i);
            }
            
        }
        
        for(int i = 1 ; i <= hset.size() ; i++){
            if(!hset.contains(i)){
                return i;
            }
        }
        return hset.size()+1;
    }
}
