class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        ArrayList<Integer> for1 = new ArrayList<>();
        for1.add(-1);
        if(arr.length <2) return for1;
        if(arr.length == 2 && arr[0] == arr[1]) return for1; 
        Arrays.sort(arr);
        ArrayList<Integer> aray = new ArrayList<>();
        for(int i = 1 ; i < arr.length; i++){
            if(arr[0] != arr[i]){
                aray.add(arr[0]);
                aray.add(arr[i]);
                return aray;
            }
        }
        return for1;
        
    }
}
