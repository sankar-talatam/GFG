class Solution {
    public void printPattern(int n) {
        for(int i = 0; i < n; i++){
            if(i == n - 1){
                for(int j = 0; j <=i ; j++){
                    System.out.print("*" + " ");
                }
            }
            else{
            for(int j = 0; j <=i ; j++){
                if(j == 0 || j == i){
                    System.out.print("*" + " ");
                }
                else{
                    System.out.print(" " + " ");
                }
            }
            }
            System.out.println();
        }
    }
}