package AAAA;
import java.util.Scanner;
public class Arrayinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for size of array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Create array
        int[] arr = new int[n];

        // Input values into array
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Display stored values
        System.out.println("You entered:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}




   
