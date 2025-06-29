// class Solution {
//     public ArrayList<Integer> topKFrequent(int[] arr, int k) {
//         // Your code here
//         HashMap<Integer,Integer> hmap = new HashMap<>();
        
//         for(int i : arr){
//             hmap.put(i , hmap.getOrDefault(i,0) + 1);
//         }
//         List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hmap.entrySet());
//         ArrayList<Integer> newList = new ArrayList<>();
//         ArrayList<Integer> newList1 = new ArrayList<>();
//          ArrayList<Integer> newList2 = new ArrayList<>();
        
//         list.sort((a,b) -> a.getValue().compareTo(b.getValue()));
//         int  min = -1;
//         for(int i = list.size()-1 ; i >= list.size()-k ; i--){
//             if(i+1 < list.size() && list.get(i) == list.get(i + 1)){
//                 newList1.add((list.get(i).getKey()));
//             }
//             else{
//                 newList1.add((list.get(i).getKey()));
//             }
            
//         }
//         return newList1;
//     }
// }
class Solution {
    public ArrayList<Integer> topKFrequent(int[] arr, int k) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        
        for (int i : arr) {
            hmap.put(i, hmap.getOrDefault(i, 0) + 1);
        }
        
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hmap.entrySet());
        list.sort((a, b) -> {
            int freqCmp = b.getValue().compareTo(a.getValue());
            if (freqCmp != 0) return freqCmp;
            return b.getKey() - a.getKey();
        });
        
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            newList.add(list.get(i).getKey());
        }
        
        return newList;
    }
}
