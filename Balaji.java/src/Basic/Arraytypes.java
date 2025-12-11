package AAAA;

import java.util.Scanner;

public class Arraytypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1D Integer Array
        int[] arr = new int[5];
        System.out.println("Enter 5 integer values:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("You entered (1D array):");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        // String Array
        String[] names = new String[3];
        System.out.println("Enter 3 names:");
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.next();
        }
        System.out.println("You entered (String array):");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println("\n");

        // 2D Array (Matrix)
        int[][] matrix = new int[2][3]; // 2 rows, 3 columns
        System.out.println("Enter 6 values for 2D array (2x3):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("You entered (2D array):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Jagged Array (different column sizes)
        int[][] jagged = new int[3][];
        jagged[0] = new int[2]; // first row has 2 columns
        jagged[1] = new int[3]; // second row has 3 columns
        jagged[2] = new int[1]; // third row has 1 column

        System.out.println("Enter values for jagged array:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = sc.nextInt();
            }
        }
        System.out.println("You entered (Jagged array):");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
