package AAAA;
import java.util.Scanner;

public class Mark {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the number (year):");
        int a = obj.nextInt();

        if (a >= 2000 && a <= 2010) {
            System.out.println("1st decade");
        } 
        else if (a >= 2011 && a <= 2020) {
            System.out.println("2nd decade");
        } 
        else if (a >= 2021 && a <= 2030) {
            System.out.println("3rd decade");
        } 
        else {
            System.out.println("Year is out of range");
        }

        obj.close();
    }
}
