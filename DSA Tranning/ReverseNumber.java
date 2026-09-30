import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();

       int reversed = 0;
        
        // The loop runs until num becomes 0; the modification happens inside
        for (; num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        
        System.out.println("Reversed Number: " + reversed);
        sc.close();
    }
}
