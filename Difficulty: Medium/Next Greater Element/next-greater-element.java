

class Solution {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> arList = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for(int i = arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                arList.add(-1);
            }
            else{
                arList.add(st.peek());
            }
            st.push(arr[i]);
        }
        Collections.reverse(arList);
        return arList;
    }
}