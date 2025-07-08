class Solution {
    void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> arrNeg = new ArrayList<>();
        ArrayList<Integer> arrPos = new ArrayList<>();
        for (int i : arr) {
            if (i < 0) {
                arrNeg.add(i);
            } else {
                arrPos.add(i);
            }
        }
        
        int k = 0, m = 0;
        
        for (int i = 0; i < arr.size(); i++) {
            if (i % 2 == 0) {
                if (k < arrPos.size()) {
                    arr.set(i, arrPos.get(k++));
                } else if (m < arrNeg.size()) {
                    arr.set(i, arrNeg.get(m++));
                }
            } else {
                if (m < arrNeg.size()) {
                    arr.set(i, arrNeg.get(m++));
                } else if (k < arrPos.size()) {
                    arr.set(i, arrPos.get(k++));
                }
            }
        }
    }
}
