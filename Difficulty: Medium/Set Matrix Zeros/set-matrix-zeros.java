class Solution {
    public void setMatrixZeroes(int[][] mat) {
        // code here
        int rows = mat.length;
        int cols = mat[0].length;

        ArrayList<Integer> zeroRows = new ArrayList<>();
        ArrayList<Integer> zeroCols = new ArrayList<>();
        for(int i = 0 ; i < mat.length; i++){
            for(int j = 0 ; j < mat[0].length; j++){
                if(mat[i][j] == 0){
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }
        for (Integer row : zeroRows) {
            for (int j = 0; j < cols; j++) {
                mat[row][j] = 0;
            }
        }

        for (Integer col : zeroCols) {
            for (int i = 0; i < rows; i++) {
                mat[i][col] = 0;
            }
        }
    }
}