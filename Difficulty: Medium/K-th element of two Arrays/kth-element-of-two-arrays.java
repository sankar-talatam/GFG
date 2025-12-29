class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        ArrayList<Integer> arList = new ArrayList<>();
        
        for(int i : a){
            arList.add(i);
        }
        for(int i : b){
            arList.add(i);
        }
        Collections.sort(arList);
        return arList.get(k-1);
    }
}