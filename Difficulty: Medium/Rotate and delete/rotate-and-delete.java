
class Solution {
    public static int rotateDelete(ArrayList<Integer> arr) {
        // code here
        int n = arr.size();
        for(int i = 0 ; i < n ; i++){
            arr.add(0,arr.get(n-1));
            arr.remove(n-(i+1));
            n--;
        }
        return arr.get(0);
    }
}
