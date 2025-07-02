class Solution {
    public int totalElements(int[] arr) {
        ArrayList<Integer> hset = new ArrayList<>();
        int min = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!hset.contains(arr[i])) {
                hset.add(arr[i]);
            }
            while (hset.size() > 2) {
                int removedElement = arr[min];
                min++;
                boolean stillExists = false;
                for (int j = min; j <= i; j++) {
                    if (arr[j] == removedElement) {
                        stillExists = true;
                        break;
                    }
                }
                if (!stillExists) {
                    hset.remove((Integer) removedElement);
                }
            }

            max = Math.max(max, i - min + 1);
        }

        return max;
    }
}
