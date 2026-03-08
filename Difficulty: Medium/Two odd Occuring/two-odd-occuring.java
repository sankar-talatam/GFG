class Solution {
    ArrayList<Integer> twoOddNum(int[] arr) {
        // code here
        ArrayList<Integer> arlist = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : arr){
            map.put(i,map.getOrDefault(i, 0) + 1);
        }
        
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            if(m.getValue() % 2 != 0){
                arlist.add(m.getKey());
            }
        }
        if(arlist.get(0) > arlist.get(1)){
            return arlist;
        }
        else{
            int temp = arlist.get(1);
            arlist.set(1,arlist.get(0));
            arlist.set(0,temp);
        }
        return arlist;
    }
}
