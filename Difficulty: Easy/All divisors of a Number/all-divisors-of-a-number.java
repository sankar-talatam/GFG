class Solution {
    public static void print_divisors(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){ 
            res.add(i);
            
            if(i != n/i) res.add(n/i);
            }
        }
        Collections.sort(res);
        for(int num:res) System.out.print(num+" ");
        
    }
}