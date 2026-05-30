class Solution {
    public void replaceElements(int[] arr) {
        // code here
        // if(arr.length)
        List<Integer> list = new ArrayList<>();
    
        list.add(arr[0] ^ arr[1]);
        for(int i = 1; i < arr.length - 1; i++){
            list.add(arr[i - 1] ^ arr[i + 1]);
        }
        
        list.add(arr[arr.length-1] ^ arr[arr.length - 2]);
        int k = 0;
        for(int i : list){
            arr[k++] = i;
        }
    }
}