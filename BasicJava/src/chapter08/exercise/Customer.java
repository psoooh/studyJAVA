package chapter08.exercise;
public class Customer {

	private String firstName;
	private String lastName;
	private BankAccount[] accounts; // 고객이 소유한 계좌
	private int numberOfAccounts; // 고객이 소유한 계좌수(최대보유 가능 계좌수 5)

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accounts = new BankAccount[5];
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public BankAccount getAccount(int index) {
		return accounts[index];
	}

	public void addAccount(BankAccount account) {
		accounts[numberOfAccounts] = account;
		numberOfAccounts++;
	}

	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public String toString() {
		//return String.format("이름: %s %s, 계좌의 갯수: %d",firstName,lastName, accounts);
		return  getFirstName() + " " + getLastName() ;
	
	}
}