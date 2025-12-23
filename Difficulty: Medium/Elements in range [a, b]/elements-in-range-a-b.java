class Solution {
    public ArrayList<Integer> cntInRange(int[] arr, int[][] queries) {
        // code here
        ArrayList<Integer> arlist = new ArrayList<>();
        
        Arrays.sort(arr);
        
        for(int i = 0 ; i < queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            
            int k = 0;
            while(k < arr.length && start > arr[k]){
                k++;
            }
            int stC = k+1;
            while(k < arr.length && arr[k] <= end){
                k++;
            }
            int endC = k+1;
            arlist.add(endC - stC);
        }
        return arlist;
    }
}
