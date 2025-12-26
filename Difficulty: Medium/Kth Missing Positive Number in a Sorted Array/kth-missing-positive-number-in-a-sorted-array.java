class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        HashSet<Integer> arlist = new HashSet<>();
        ArrayList<Integer> misarList = new ArrayList<>();
        
        for(int i = 0 ; i < arr.length; i++){
             arlist.add(arr[i]);
        }
        
        for(int i = 1 ; i <= arr[arr.length-1]; i++){
            if(!arlist.contains(i)){
                misarList.add(i);
            }
        }
        
        if(k > misarList.size()){
            return arr[arr.length-1] + k - misarList.size();
        }
        return misarList.get(k-1);
    }
}