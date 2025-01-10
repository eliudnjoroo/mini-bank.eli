package Bank;



import java.util.Scanner;



public class bank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account name:");

        String custName = scanner.nextLine();

        System.out.println("Enter customer ID:");

        String custID = scanner.nextLine();

        Account account = new Account(custName, custID);



        System.out.println("---------------------------------");

        System.out.println("Welcome, " + account.customerName + "!");

        System.out.println("Your ID is: " + account.customerID);

        System.out.println("---------------------------------");

        System.out.println("Select Any Option To Proceed:");

        System.out.println("A. Check Balance");

        System.out.println("B. Deposit");

        System.out.println("C. Withdraw");

        System.out.println("D. Previous Transaction");

        System.out.println("E. Interest");

        System.out.println("F. Exit");



        char option;
        boolean flag = true;

        while (flag) {

            System.out.println("Enter Your Choice:");
            option = Character.toUpperCase(scanner.next().charAt(0));


            switch (option) {

                case 'A':

                    System.out.println("Account Balance = $" + account.balance);

                    break;

                case 'B':

                    System.out.println("Enter an amount to deposit: ");

                    int depositAmount = scanner.nextInt();

                    account.deposit(depositAmount);

                    break;

                case 'C':

                    System.out.println("Enter an amount to withdraw: ");

                    int withdrawAmout = scanner.nextInt();

                    account.withdraw(withdrawAmout);

                    break;

                case 'D':

                    account.getPreviousTransaction();

                    break;

                case 'E':

                    System.out.println("Enter the years for which you wish to calculate the intrest:");

                    int years = scanner.nextInt();

                    account.calculateInterest(years);

                    break;

                case 'F':

                    System.out.println("Thank you for banking with us!");

                    scanner.close();

                    flag = false;

                    break;

                default:

                    System.out.println("Error: Invalid option. Please enter A, B, C, D, or E to access services.");

            }

        }

    }

    public static void prompt(){
        
    }
}
