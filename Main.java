import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account =
                new BankAccount("Ganesh", 1000.00);

        int choice = 0;

        while (choice != 5) {

            System.out.println("\n===== BANK ACCOUNT SIMULATION =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {

                    case 1:
                        account.checkBalance();
                        break;

                    case 2:
                        System.out.print("Enter deposit amount: Rs. ");
                        double depositAmount =
                                Double.parseDouble(sc.nextLine());
                        account.deposit(depositAmount);
                        break;

                    case 3:
                        System.out.print("Enter withdrawal amount: Rs. ");
                        double withdrawAmount =
                                Double.parseDouble(sc.nextLine());
                        account.withdraw(withdrawAmount);
                        break;

                    case 4:
                        account.showTransactions();
                        break;

                    case 5:
                        System.out.println("Thank you for using the Bank Account Simulation!");
                        break;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        sc.close();
    }
}