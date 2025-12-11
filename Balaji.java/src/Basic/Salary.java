package AAAA;

import java.util.Scanner; 

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double baseSalary = 50000;
        System.out.print("Enter number of leave days: ");
        int leaveDays = sc.nextInt();

        System.out.print("Enter performance rating: ");
        int rating = sc.nextInt();

        double finalSalary = baseSalary;

        // Leave deduction                       
        if (leaveDays > 5) {
            int extraLeaves = leaveDays - 5;
            finalSalary -= extraLeaves * 500;
        }

        // Performance deduction
        if (rating >= 90) {
            // No deduction
        } else if (rating >= 75) {
            finalSalary -= finalSalary * 0.02; // 2% deduction
        } else {
            finalSalary -= finalSalary * 0.05; // 5% deduction
        }

        System.out.println("Final Salary: " + finalSalary);
        sc.close();
    }
}
