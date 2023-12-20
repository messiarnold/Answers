package bank;

import java.util.Scanner;

public class Bank{
	private Account[] accounts = new Account[2000];
	private int num_of_accounts = 0;
	private double money_in_ILS;
	private double money_in_USD;
	private double all_the_money;


	

	Scanner scanner = new Scanner(System.in);

	public void addAccount(){
		System.out.println("Enter your money in ILS:");
		String money_in_ILS = scanner.nextLine();
		System.out.println("Enter your money in USD:");
		String money_in_USD = scanner.nextLine();
		System.out.println("Enter your name:");
		String name = scanner.nextLine();
		System.out.println("Enter your ID:");
		String id = scanner.nextLine();
		System.out.println("Enter your geographic area(city):");
		String geographic_area = scanner.nextLine();
		Account account = new Account(Double.parseDouble(money_in_ILS), Double.parseDouble(money_in_USD), 0, name,Integer.parseInt(id),geographic_area);
		accounts[num_of_accounts] = account;
		num_of_accounts++;
	}
	
	public void deleteAccount() {
		System.out.println("Enter your id:");
		String id = scanner.nextLine();
	
		for (int i = 0; i < num_of_accounts; i++) {
			if (accounts[i].getId() == Integer.parseInt(id)) {
				for (int j = i; j < num_of_accounts - 1; j++) {
					accounts[j] = accounts[j + 1];
				}
				accounts[num_of_accounts - 1] = null;
				num_of_accounts--;
				break;
			}
		}
	}
	public void addMoney(){
		System.out.println("Enter your ID:");
		String id = scanner.nextLine();
		System.out.println("Enter the amount of money you want to add:");
		String moneyToAdd = scanner.nextLine();
		for (int i = 0; i < num_of_accounts; i++) {
			if (accounts[i].getId() == Integer.parseInt(id)) {
				accounts[i].setMoney_in_new_ILS(accounts[i].getMoney_in_new_ILS() + Integer.parseInt(moneyToAdd));
			}
		}
	}

	public void lessMoney(){
		System.out.println("Enter your ID:");
		String id = scanner.nextLine();
		System.out.println("Enter the amount of money you want to less:");
		String moneyToLess = scanner.nextLine();
		for (int i = 0; i < num_of_accounts; i++) {
			if (accounts[i].getId() == Integer.parseInt(id)) {
				accounts[i].setMoney_in_new_ILS(accounts[i].getMoney_in_new_ILS() - Integer.parseInt(moneyToLess));
			}
		}
	}

	public Account[] topFive() {
		if (num_of_accounts < 5) {
			return null;
		}
		Account[] topFiveAccounts = new Account[5];
		for (int i = 0; i < 5; i++) {
			topFiveAccounts[i] = accounts[i];
		}
	
		for (int i = 0; i < num_of_accounts; i++) {
			for (int n = 0; n < 5; n++) {
				if (topFiveAccounts[n] != null && accounts[i].getAll_the_money_in_new_ILS() > topFiveAccounts[n].getAll_the_money_in_new_ILS()) {
					topFiveAccounts[n] = accounts[i];
					break;
				}
			}
		}
		return topFiveAccounts;
	}
	
	
	public Account[] inMinus() {
		int accountsInMinus = 0;
		for(int i = 0;i < num_of_accounts;i++){
			if (accounts[i].getAll_the_money_in_new_ILS() < 0) {
				accountsInMinus++;
			}
		}
		Account[] inMinusAccounts = new Account[accountsInMinus];
		int counter = 0;
		for (int i = 0; i < num_of_accounts; i++) {
			if (accounts[i].getAll_the_money_in_new_ILS() < 0) {
				inMinusAccounts[counter] = accounts[i];
				counter++;
			}
		}
		return inMinusAccounts;
	}
	
	public int oweMoneyToTheBank(){
		int sum = 0;
		Account[] inMinus = inMinus();
		for (Account account : inMinus) {
			sum += -1 * (account.getAll_the_money_in_new_ILS());
		}
		return sum;
	}


	// to string
	@Override
	public String toString() {
    StringBuilder result = new StringBuilder("Bank [num_of_accounts=" + num_of_accounts + ", all_the_money=" + all_the_money + ", topFiveAccounts=[");

    Account[] topFiveAccounts = topFive();
	if (num_of_accounts >= 5) {
		for (int i = 0; i < 5; i++) {
			result.append(topFiveAccounts[i]);
			if (i < 4) {
				result.append(", ");
			}
		}
	}
	else{
		result.append("you must to have at list five Accounts to use top five function");
	}

    result.append("]]");
    return result.toString();
	}


	// get / set
	public Account[] getAccounts() {
		return accounts;
	}
	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	public int getNum_of_accounts() {
		return num_of_accounts;
	}
	public void setNum_of_accounts(int num_of_accounts) {
		this.num_of_accounts = num_of_accounts;
	}
	public double getMoney_in_ILS() {
		return money_in_ILS;
	}
	public void setMoney_in_ILS(double money_in_ILS) {
		this.money_in_ILS = money_in_ILS;
	}
	public double getMoney_in_USD() {
		return money_in_USD;
	}
	public void setMoney_in_USD(double money_in_USD) {
		this.money_in_USD = money_in_USD;
	}
	public double getAll_the_money() {
		return all_the_money;
	}
	public void setAll_the_money(double all_the_money) {
		this.all_the_money = all_the_money;
	}
	public Scanner getScanner() {
		return scanner;
	}
	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}
}