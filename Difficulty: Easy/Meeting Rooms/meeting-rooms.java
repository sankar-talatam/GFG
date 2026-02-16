class Solution {
    static boolean canAttend(int[][] arr) {
        // code here
        HashSet<Integer> hset = new HashSet<>();
        
        for(int i = 0; i < arr.length; i++){
            for(int j = arr[i][0]; j < arr[i][1]; j++){
                if(hset.contains(j)) return false;
                else hset.add(j);
            }
        }
        return true;
    }
}