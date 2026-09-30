import java.util.Scanner;

public class positiveCOUNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the num to check frequency OF !");
        int m = sc.nextInt();
        
        int count = 0;

        do {
            int digit = n % 10;

            if (digit == m) {
                count++;
            }

            n = n / 10;

        } while (n > 0);

        System.out.println(count);
        sc.close();
    }
}
