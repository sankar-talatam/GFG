class Solution {
    int minRow(int mat[][]) {
        // code here
        int  min = Integer.MAX_VALUE;
        int minI = 1000;
        int count = 0;
        for(int i = 0; i < mat.length; i++){
            count = 0;
            
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 1) count++;
            }
            if(count < min){
                min = count;
                minI = i;
            }
            if(count == min){
                minI = Math.min(minI,i);
            }
        }
        return minI+1;
    }
};