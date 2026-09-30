import java.util.*;

public class twins{
    public static void main(System[] args){
        Scanner sc = new  Scanner(System.in);

        System.out.println("enter the no of coins");
        int n = sc.nextInt();

        int [] coins = new int[n];
        int total = 0;

        for(int i = 0 ; i< n; i++){
            coins[i] = sc.nextInt();
            total += coins[i];
        }

        Arrays.sort(coins);
        int mysum = 0;
        int count = 0;

        for(int i = n-1 ; i >= 0; i--){
            mysum += coins[i];
            count++;

            int remaining = total - mysum;
            if(mysum > remaining){
                break;
            }
        }
        System.out.println(count);
        sc.close();
    }
}