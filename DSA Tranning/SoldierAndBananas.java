import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long k = scanner.nextLong();
        long n = scanner.nextLong();
        long w = scanner.nextLong();
        
        long totalCost = k * (w * (w + 1)) / 2;
        
        long borrow = totalCost - n;
        
        if (borrow > 0) {
            System.out.println(borrow);
        } else {
            System.out.println(0);
        }
        
        scanner.close();
    }
}