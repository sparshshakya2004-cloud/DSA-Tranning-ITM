import java.util.Scanner;
public class countPrimeComposite {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        int prime = 0;
        int compos = 0 ;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
            for(int i = 2; i < n-1 ; i++){
            if(n%i==0){
                prime++;
                break;
            }
        }
        }
        System.out.println(sum);


        sc.close();
    }
}
