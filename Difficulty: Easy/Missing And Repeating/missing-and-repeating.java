class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n = arr.length;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            hmap.put(arr[i] , hmap.getOrDefault(arr[i],0) + 1);
        }
        
        ArrayList<Integer> arlist = new ArrayList<>();
        int mis = -1;
        int rep = -1;
        
        for(int i = 1; i <=n; i++){
            if(hmap.get(i) == null){
                mis = i;
            }
            else if(hmap.get(i) == 2){
                rep = i;
            }
            if(mis != -1 && rep != -1) break;
        }
        
        arlist.add(rep);
        arlist.add(mis);
        
        return arlist;
        
    }
}
