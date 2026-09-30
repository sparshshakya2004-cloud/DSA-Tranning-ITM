import java.util.Scanner;

public class ElephantSteps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        
        int steps = (x + 4) / 5;
        
        System.out.println(steps);
        
        scanner.close();
    }
}