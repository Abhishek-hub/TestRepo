import java.util.Scanner;

public class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerid;

    BankAccount(String cName, String cid) {
        customerName = cName;
        customerid = cid;
    }

    public void deposite(int amount) {
        if (amount > 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    public void withDraw(int amount) {
        if (amount > 0) {
            balance = balance - amount;
            previousTransaction = -amount;

        }
    }

    public void getpreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println ("Deposited = " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println ("Withdrawn amount is" + Math.abs (previousTransaction));
        } else {
            System.out.println ("No transaction occured");
        }
    }

    public void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner (System.in);

        System.out.println ("Welcome " + customerName);
        System.out.println ("Your ID is " + customerid);
        System.out.println ("\n");
        System.out.println ("A. Check Balanace");
        System.out.println ("B. Deposite");
        System.out.println ("C. Withdrawn");
        System.out.println ("D. previous transaction");
        System.out.println ("E. Exit");

        do {
            System.out.println ("================================================================");
            System.out.println ("Enter the option");
            System.out.println ("================================================================");
            option = scanner.next ( ).charAt (0);
            System.out.println ("\n");

            switch (option) {
                case 'A':
                    System.out.println ("-----------------------");
                    System.out.println ("Your balance is " + balance);
                    System.out.println ("------------------------");
                    System.out.println ("\n");
                    break;
                case 'B':
                    System.out.println ("-----------------------");
                    System.out.println ("Enter amount to deposite :");
                    int amount = scanner.nextInt ( );
                    deposite (amount);
                    System.out.println ("------------------------");
                    System.out.println ("\n");
                    break;
                case 'C':
                    System.out.println ("-----------------------");
                    System.out.println ("Enter amount to  Withdrawn:");
                    int amount2 = scanner.nextInt ( );
                    withDraw (amount2);
                    System.out.println ("------------------------");
                    System.out.println ("\n");
                    break;
                case 'D':
                    System.out.println ("-----------------------");
                    getpreviousTransaction ( );
                    System.out.println ("------------------------");
                    System.out.println ("\n");
                    break;
                default:
                    System.out.println ("Invalid option!!.please enter a valid option");
                    break;


            }

        } while (option != 'E');
        System.out.println ("Thanking you for using our services");


    }


}

