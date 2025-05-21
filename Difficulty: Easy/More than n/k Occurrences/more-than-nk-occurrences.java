class Solution {
    // Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int k) {
        // your code here,return the answer
        int c = 0;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i = 0 ; i < arr.length; i++){
            hmap.put(arr[i],hmap.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> ar: hmap.entrySet()){
            if(ar.getValue()> arr.length/k){
                c++;
            }
        }
        return c;
    }
}
