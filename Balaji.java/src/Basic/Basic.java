package AAAA;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // char
        System.out.println("Enter your surname :");
        char surname = sc.next().charAt(0);
        sc.nextLine();   // FIX: nextLine() (capital L)

        // String
        System.out.println("Enter your name:");
        String name = sc.nextLine();  // FIX: nextLine()

        // integer
        System.out.println("Enter your age:");
        int age = Integer.parseInt(sc.nextLine()); 
        // FIX: Integer.parseInt() and nextLine()

        // float
        System.out.println("Enter float value:");
        float f = Float.parseFloat(sc.nextLine());
        // FIX: Float.parseFloat()

        // Output
        System.out.println("\n--- OUTPUT ---");
        System.out.println("Surname (char): " + surname);
        System.out.println("Name (String): " + name);
        System.out.println("Age (int): " + age);
        System.out.println("Float value: " + f);

        sc.close();
    }
}
