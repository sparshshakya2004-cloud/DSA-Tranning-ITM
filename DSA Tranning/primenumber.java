import java.util.Scanner;

public class primenumber {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

         boolean isPrime = true;

        // Numbers less than 2 are not prime
        if (n < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {

                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is Not a Prime Number");
        }
        sc.close();
    }
}
