class Solution {
    public int kthSmallest(int[][] mat, int k) {
        // code here
        
        ArrayList<Integer> arList = new ArrayList<>();
        
        for(int i = 0 ; i < mat.length; i++){
            for(int j = 0 ; j < mat[0].length; j++){
                arList.add(mat[i][j]);
            }
        }
        Collections.sort(arList);
       return arList.get(k-1);
    }
}
