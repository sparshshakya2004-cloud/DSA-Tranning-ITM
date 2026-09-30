import java.util.Scanner;

public class DSATranning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noofday = sc.nextInt();
        int count = 0;

        for(int i = 0; i<=noofday ;i++){
            int daysolved = sc.nextInt();
            if(daysolved>= 10 && daysolved%2==0){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
    
}
