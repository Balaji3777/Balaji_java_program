package ENCAPSULATION;

public class Task3 {
	private double balance;

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }


    public void printBalance() {
        System.out.println("Current Balance: " + balance);
    }

   
    public static void main(String[] args) {
        Task3 account = new Task3();

        account.deposit(2000);
        account.printBalance();

        account.withdraw(1000);
        account.printBalance();

        account.withdraw(800); 
        account.printBalance();
    }
}

