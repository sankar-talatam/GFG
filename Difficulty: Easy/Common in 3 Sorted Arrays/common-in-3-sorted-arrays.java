class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i : a){
            set.add(i);
        }

        for(int i : b){
            if(set.contains(i) && !seen.contains(i)){
                list.add(i);
                seen.add(i);
            }
        }

        HashSet<Integer> set1 = new HashSet<>();
        for(int i : c){
            set1.add(i);
        }

        ArrayList<Integer> temp = new ArrayList<>();
        for(int i : list){
            if(set1.contains(i)){
                temp.add(i);
            }
        }

        return temp;
    }
}