import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Account {
    double balance = 0;
    List<String> transactions = new ArrayList<>();

    private String getCurrentTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return LocalDateTime.now().format(formatter);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Account bank = new Account();
        boolean running = true;

        while (running) {
            System.out.println("\nOperation performed on Bank Account");
            System.out.println("1. Check the account balance");
            System.out.println("2. Withdraw the money from account");
            System.out.println("3. Deposit the money to the account");
            System.out.println("4. Transaction history of the Bank account");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The balance of the account: " + bank.balance);
                    break;
                case 2:
                    System.out.println("Enter the Withdraw amount:");
                    double WithDrawAmount = sc.nextDouble();
                    bank.Withdraw(WithDrawAmount);
                    break;
                case 3:
                    System.out.println("Enter the Deposit amount:");
                    double DepositAmount = sc.nextDouble();
                    bank.Deposit(DepositAmount);
                    break;
                case 4:
                    bank.TransactionHistory();
                    break;
                case 5:
                    System.out.println("Exit");
                    running = false;
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public void Withdraw(double WithDrawAmount) {
        if (balance >= WithDrawAmount) {
            balance = balance - WithDrawAmount;
            System.out.println("The amount after the withdraw: " + balance);
            transactions.add(getCurrentTime() + " Withdraw Amount: " + WithDrawAmount + " Balance: " + balance);
        } else {
            System.out.println("There is no sufficient money to withdraw");
            transactions.add(getCurrentTime() + " Transaction failed - Tried to withdraw: " + WithDrawAmount);
        }
    }

    public void Deposit(double DepositAmount) {
        balance = balance + DepositAmount;
        System.out.println("The amount after the Deposit: " + balance);
        transactions.add(getCurrentTime() + " Deposited Amount: " + DepositAmount + " Balance: " + balance);
    }

    public void TransactionHistory() {
        System.out.println("\nTransaction History:");
        if (transactions.isEmpty()) {
            System.out.println("No transaction is done");
        } else {
            for (String t : transactions) {
                System.out.println(t);
            }
        }
    }
}
