import java.util.Scanner;

public class SpyDetected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            
            int common;
            if (arr[0] == arr[1]) {
                common = arr[0];
            } else {
                
                common = (arr[0] == arr[2]) ? arr[0] : arr[1];
                if (arr[0] != arr[2]) {
                    System.out.println(1); // Agar arr[0] hi spy hai
                    continue;
                }
            }
            
            
            for (int i = 0; i < n; i++) {
                if (arr[i] != common) {
                    System.out.println(i + 1); 
                    break;
                }
            }
        }
        
        sc.close();
    }
}