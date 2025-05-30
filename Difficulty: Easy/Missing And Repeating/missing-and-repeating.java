// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int s1=0;
        ArrayList<Integer> brr=new ArrayList<>();
        HashMap<Integer,Integer> newHp=new HashMap<>();
            for(int num : arr){
                if(newHp.containsKey(num)){
                    newHp.put(num,newHp.get(num)+1);
                }
                else{
                    newHp.put(num,1);
                }
                s1+=num;
        }
        int s3=0;
        for (int key : newHp.keySet()) {
    if (newHp.get(key) == 2) {
        s3=key;
    }
}
        int n=arr.length;
        int s2=0;
        for(int i = 1; i <= n ; i++){
            s2+=i;
        }
        int newS=s2-s1+s3;
        brr.add(s3);
        brr.add(newS);
        return brr;
    }
}
