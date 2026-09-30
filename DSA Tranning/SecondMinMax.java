import java.util.Scanner;

public class SecondMinMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];

        for(int i =0 ; i < arr.length ;i++){
            System.out.print("Enter the nuber "+ (i+1) +" at position : ");
            arr[i] = sc.nextInt();   
        }

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        // Find second largest and second smallest
        for (int i = 1; i < arr.length; i++) {

            // Second largest
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }

            // Second smallest
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Second Largest = " + secondLargest);
        System.out.println("Second Smallest = " + secondSmallest);
        sc.close();
    }
    
}
