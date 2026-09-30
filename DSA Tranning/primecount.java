import java.util.Scanner;

public class primecount {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        boolean count = false;

        for(int i = 2; i < n-1 ; i++){
            if(n%i==0){
                count = true;
                break;
            }
        }
        if(count == true){
            System.out.println(n + " is Not Prime");
        }else{
            System.out.println(n + " is Prime");
        }
        sc.close();
    }
}
