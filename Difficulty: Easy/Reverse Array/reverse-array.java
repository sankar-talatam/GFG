

class Solution {
    public void reverseArray(int arr[]) {
        // code here\
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i : arr){
            ar.add(i);
        }
        Collections.reverse(ar);
        int k = 0;
        for(int i : ar){
            arr[k++] = i;
        }
    }
}