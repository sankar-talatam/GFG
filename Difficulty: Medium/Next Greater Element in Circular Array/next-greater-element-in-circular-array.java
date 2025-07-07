class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int nextGreater = -1;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    nextGreater = arr[j];
                    break;
                }
            }

            if (nextGreater == -1) {
                for (int j = 0; j < i; j++) {
                    if (arr[j] > arr[i]) {
                        nextGreater = arr[j];
                        break;
                    }
                }
            }

            result.add(nextGreater);
        }

        return result;
    }
}
