class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        Map<Integer,Integer> hmap = new HashMap<>();
        ArrayList<Integer> newArr = new ArrayList<>();
        HashSet<Integer> newSet = new LinkedHashSet<>();
        for(int i : arr){
            hmap.put(i,hmap.getOrDefault(i,0)+1);
            if(hmap.getOrDefault(i,0) > (Math.floor(arr.length / 3))){
                newSet.add(i);
            }
        }
        for(int i : newSet){
            newArr.add(i);
        }
        Collections.sort(newArr);
        return newArr;
        
    }
}