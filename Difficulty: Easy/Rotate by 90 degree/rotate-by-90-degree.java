class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
        int[][] newmat = new int[mat[0].length][mat.length];
        for(int i = mat[0].length-1; i>=0; i--){
            for(int j = 0; j < mat.length; j++){
                newmat[mat[0].length-1-i][j] = mat[j][i];
            }
        }
        for(int i = 0 ; i < mat.length; i++){
            for(int j = 0 ; j < mat[0].length; j++){
                mat[i][j] = newmat[i][j];
            }
        }
    }
}