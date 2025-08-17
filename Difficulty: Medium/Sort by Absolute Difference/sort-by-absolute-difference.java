class Solution {
    public void rearrange(int[] arr, int x) {
        // code here
        
        ArrayList<Integer> arList =  new ArrayList<>();
        
        for(int i : arr){
            arList.add(i);
        }
        Collections.sort(arList,(a,b) ->{
            int d1 = Math.abs(a - x);
            int d2 = Math.abs(b - x);
            
            return d1-d2;
        });
        int  k = 0;
        for(int i : arList){
                arr[k++] =i;
                
        }
        
    }
}
