class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        
        HashSet<Integer> set = new LinkedHashSet<>();
        for(int i = 0; i < a.length; i++){
                set.add(a[i]);
        }
        
        for(int i = 0; i < b.length; i++){
                set.add(b[i]);
        }
        ArrayList<Integer> arlist = new ArrayList<>(set);
        
        return arlist;
    }
}