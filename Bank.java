import java.util.ArrayList;

public class Bank {

// instance members

	private ArrayList<Object> accounts;

//constructor

	public Bank() {

		accounts = new ArrayList<>();

	}

	public void addAccount(Account account) {

		accounts.add(account);

		System.out.println("Thank you, the account number is " + account.getAccountNumber());

	}

	public void listAccounts() {

		accounts.forEach(System.out::println);

	}

	public void depositAccount(int accountNumber, double amount) {

		for (int i = 0; i < accounts.size(); i++) {

			if (((Account) accounts.get(i)).getAccountNumber() == accountNumber) {

				((Account) accounts.get(i)).deposit(amount);

				return;

			}

		}

		System.out.println("Account not found");

	}

	public void withdrawAccount(int accountNumber, double amount) {

		for (int i = 0; i < accounts.size(); i++) {

			if (((Account) accounts.get(i)).getAccountNumber() == accountNumber) {

				((Account) accounts.get(i)).withdraw(amount);

				return;

			}

		}

		System.out.println("Account not found");

	}

//closes the account

	public void closeAccount(int accountNumber) {

		for (int i = 0; i < accounts.size(); i++) {

			if (((Account) accounts.get(i)).getAccountNumber() == accountNumber) {

				((Account) accounts.get(i)).setClosed(true);

				System.out.println("Account closed, current balance is " + ((Account) accounts.get(i)).getBalance()

						+ ", deposits are no longer possible");

				return;

			}

		}

		System.out.println("Account not found");

	}

}