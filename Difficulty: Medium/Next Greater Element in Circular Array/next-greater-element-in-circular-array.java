class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
        // code here
        ArrayList<Integer> arList = new ArrayList<>();
        
        for(int i = 0 ; i < arr.length; i++){
            int val = -1;
            for(int j = i+1 ; j < arr.length; j++){
                if(arr[j] > arr[i]){
                    val = arr[j];
                    break;
                }
            }
            if(val == -1){
                for(int j = 0; j < i; j++){
                    if(arr[j] > arr[i]){
                        val = arr[j];
                        break;
                    }
                }
            }
                arList.add(val);
            
            
        }
        return arList;
    }
}