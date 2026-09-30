import java.util.Scanner;

public class array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        for(int i =0 ; i<5 ; i++){
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("\n");
        System.out.println("Enter in the array is");
        for(int j = 0 ;j<5;j++){
            System.out.println(arr[j]);
        }
        System.out.print("\n");

    }
}