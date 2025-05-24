// User function Template for Java

class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        int n = Math.max(a.length,b.length);
        for(int i = 0 ; i < n; i++){
            if(i<a.length){
                arr.add(a[i]);
            }
            if(i<b.length){
                arr.add(b[i]);
            }
            
        }
        Collections.sort(arr);
        for(int i = 0; i< a.length; i++){
            a[i] = arr.get(i);
            
        }
        int k = a.length;
        for(int i = 0; i < b.length; i++  ){
            b[i] = arr.get(k++);
        }
        
        
    }
}
