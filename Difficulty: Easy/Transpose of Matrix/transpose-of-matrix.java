class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
        ArrayList<ArrayList<Integer>> arlist = new ArrayList<>();
        
       
        for(int i = 0; i < mat.length; i++){
            ArrayList<Integer> arl = new ArrayList<>();
            for(int j = 0 ; j < mat[0].length; j++){
                arl.add(mat[j][i]);
            }
            arlist.add(arl);
        }
        return arlist;
    }
}