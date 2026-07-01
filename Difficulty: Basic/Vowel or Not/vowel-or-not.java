import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        // code here
        String vowel = "aeiouAEIOU";
        
        System.out.print(vowel.contains(String.valueOf(ch)));
    }
}