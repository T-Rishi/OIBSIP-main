import java.util.*;

public class Bank {

  static Scanner scanner = new Scanner(System.in);
  static long balance = 1000;
  static LinkedHashSet<String> str = new LinkedHashSet<String>();

  public static void main(String[] args) {
    System.out.print("Your a new User so,\nEnter your new User_name :");
    String user_name = scanner.next();
    boolean f = true;
    System.out.print("Enter your New-Transaction PIN: ");
    int pin = scanner.nextInt();
    if (f) {
      int choice;
      do {
        System.out.println("\nATM Menu:");
        System.out.println("1. View Transactions History");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Check Balance");
        System.out.println("5. Quit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        switch (choice) {
          case 1:
            viewTransactions();
            break;
          case 2:
            withdraw();
            break;
          case 3:
            deposit();
            break;
          case 4:
            check_balance();
            break;
          case 5:
            System.out.println("Thank you for using the ATM!");
            break;
          default:
            System.out.println("Invalid choice, please try again.");
        }
      } while (choice != 5);
    } else {
      System.out.println("Authentication failed, please try again.");
    }
  }

  private static void viewTransactions() {
     Iterator<String> itr1 = str.iterator();
     while (itr1.hasNext()) {
       System.out.println(itr1.next());
     }
  }

  private static void withdraw() {
    System.out.println("Enter the amount to withdraw :");
    int withdraw_amt = scanner.nextInt();
    if (withdraw_amt > balance) {
      System.out.print("Your balance is lower than " + withdraw_amt);
    } else {
      balance -= withdraw_amt;
      System.out.println("Available balance in your account is " + balance);
      String wb_amt = Integer.toString(withdraw_amt);
      String wb = "Debited ";
      wb = wb.concat(wb_amt);
      str.add(wb);
    }
  }

  private static void deposit() {
    System.out.println("Enter the amount to Deposit :");
    int deposit_amt = scanner.nextInt();
    balance += deposit_amt;
    String d_amt = Integer.toString(deposit_amt);
    String d = "Credited ";
    d = d.concat(d_amt);
    str.add(d);
  }

  private static void check_balance() {
    System.out.println("Available balance in your account is " + balance);
  }
}
