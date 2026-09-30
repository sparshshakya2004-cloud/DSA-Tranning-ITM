import java.util.Scanner;

public class arrayPrint {
    public static void main(String[]  args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        
        for(int i =0 ; i< arr.length ; i++){
            System.out.print("Enter the nuber "+ (i+1) +" at position : ");
            arr[i] = sc.nextInt();
        }     
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
         
         sc.close();

    }  
}
