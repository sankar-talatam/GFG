import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        int val = n % 10;
        if(val < 0){
            System.out.print(val + (-(val + val)));
        }
        else{
            System.out.print((int)n % 10);
        }
    }
}