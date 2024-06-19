/*Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance.
Provide public getter and setter methods to access and modify these variables.*/

package Incapsulation2;

public class Bank {
        public static void main(String[] args) {
            // Create an instance of BankAccount
            BankAcc account = new BankAcc();

            // Set values using setter methods
            account.setAccountNumber("SB-09876");
            account.setBalance(2000.0);

            // Get values using getter methods
            String accountNumber = account.getAccountNumber();
            double balance = account.getBalance();

            // Print the values
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }

}
