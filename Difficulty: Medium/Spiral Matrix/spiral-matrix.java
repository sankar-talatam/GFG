// User function Template for Java

class Solution {

    public int findK(int a[][], int n, int m, int k) {
        // Your code goes here
        ArrayList<Integer> arlist = new ArrayList<>();
        
        int left = 0;
        int right = a[0].length - 1;
        int top = 0;
        int bottom = a.length - 1;
        
        while(top <= bottom && left <= right){
            
            for(int i = left; i <= right; i++){
                arlist.add(a[top][i]);
            }
            top++;
            
            for(int i = top; i <= bottom; i++){
                arlist.add(a[i][right]);
            }
            right--;
            
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    arlist.add(a[bottom][i]);
                }
                bottom--;    
            }
            
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    arlist.add(a[i][left]);
                }
                left++;
            }
            
        }
        return arlist.get(k-1);
    }
}