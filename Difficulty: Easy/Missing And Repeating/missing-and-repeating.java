// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> arList = new ArrayList<>();
       HashMap<Integer,Integer> hmap = new HashMap<>();
       Arrays.sort(arr);
       int c = 0;
       int[] newArr = new int[2];
       int n = arr.length;
       for(int i = 1 ; i <= n ; i++ ){
           hmap.put(arr[i-1],hmap.getOrDefault(arr[i-1],0)+1);
       }
       for(int i = 1 ; i <= n ; i++){
           if(hmap.getOrDefault(i,0) == 0){
               newArr[1] = i;
               c++;
           }
           else if(hmap.getOrDefault(i,0) == 2){
               newArr[0] = i;
               c++;
           }
           if(c == 2) break;
       }
       for(int i : newArr){
           arList.add(i);
       }
       return arList;
    }
}
