

// User function Template for Java


class Solution {
    static void rotateArr(int arr[], int d) {
        if (arr.length == 1) {
            return;
        }

        d = d % arr.length;

        ArrayList<Integer> ar = new ArrayList<>();

        for (int i = d; i < arr.length; i++) {
            ar.add(arr[i]);
        }

        for (int i = 0; i < d; i++) {
            ar.add(arr[i]);
        }

        int k = 0;
        for (int i : ar) {
            arr[k++] = i;
        }
    }
}
