class Solution {
    public int minSoldiers(int[] arr, int k) {
        // code here
        int count = 0; 
        int n =(int)Math.ceil(arr.length / 2.0);
        for(int i : arr){
            if(i % k == 0){
                count++;
            }
        }
        // System.out.println(count);
        if(count>= n){
            return 0;
        }
        ArrayList<Integer> arList = new ArrayList<>();
        for(int i : arr){
            if(i % k != 0){
                arList.add((i / k + 1)* k - i);
            }
        }
        int sum = 0;
        Collections.sort(arList);
        for(int i = 0 ; i < n - count; i++){
            sum += arList.get(i);
        }
        // System.out.println(sum);
        return sum;
    }
}