import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[100];
        

        for(int i = 0 ; i < 5 ;i++){
            System.out.print("Enter the Number");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to search");
        int ser = sc.nextInt();
        for(int j =0 ; j<5 ;j++){
            if(arr[j] == ser){
                System.out.println("Element "+ser+" Found At Index : " + j);
            }else{
                System.out.println("Element "+ser+" not found in Arr");
            }
        }

        sc.close();
    }
}
