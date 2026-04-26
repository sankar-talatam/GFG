class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(-1);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                list.set(0,i);
                break;
            }
        }
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] == x){
                list.set(1,i);
                break;
            }
        }
        return list;
    }
}
