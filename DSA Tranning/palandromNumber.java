import java.util.Scanner;

public class palandromNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        
        int originalNum = num;
        int reversed = 0;
        
        // The loop runs until num becomes 0; the modification happens inside
        for (; num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        
        if(originalNum == reversed){
            System.out.println(originalNum + " IS PALANDROM");
        }else{
            System.out.println(originalNum + " IS NOT PALANDROM");
        }
        sc.close();
    }
}
