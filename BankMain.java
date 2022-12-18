
import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice;

		Bank bank = new Bank();
		do {

			displayMenu();
			choice = input.nextInt();
			input.nextLine();
			switch (choice) {

			case 1:
				System.out.print("\nEnter first name: ");
				String fn = input.nextLine();
				System.out.print("\nEnter last name: ");
				String ln = input.nextLine();
				System.out.print("\nEnter social security number: ");
				String ssn = input.nextLine();
				System.out.print("\nEnter Account Name: ");
				String acctName = input.nextLine();
				bank.addAccount(new Account(new Customer(fn, ln, ssn), acctName));
				break;

			case 2:
				bank.listAccounts();
				break;

			case 3:
				System.out.print("Enter account number: ");
				int acctNo = input.nextInt();
				System.out.print("Enter the amount to deposit: ");
				double amount = input.nextDouble();
				bank.depositAccount(acctNo, amount);
				break;

			case 4:
				System.out.print("Enter account number: ");
				acctNo = input.nextInt();
				System.out.print("Enter the withdrawal amount: ");
				amount = input.nextDouble();
				bank.withdrawAccount(acctNo, amount);
				break;

			case 5:
				System.out.print("Enter account number: ");
				acctNo = input.nextInt();
				bank.closeAccount(acctNo);
				break;

			case 6:
				break;

			default:
				System.out.println("Invalid choice. Try Again!!!");
				break;
			}
		} while (choice != 8);

	}

	private static void displayMenu() {
		System.out.println("1 - Open Account");
		System.out.println("2 - List accounts");
		System.out.println("3 - Deposit funds");
		System.out.println("4 - Withdraw funds");
		System.out.println("5 - Close an account");
		System.out.println("6 - Exit");
		System.out.print("\nPlease enter your choice: ");

	}

}
