package chapter08.exercise;
public abstract class BankAccount {

	protected int balance; // 잔액

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() { // 현재 계좌의 잔액
		return balance;
	}

	public void deposit(int amount) { // 입금 메소드
		balance += amount;
	}

	public boolean withdraw(int amount) { // 출금 메소드
		if (balance < amount) {
			return false;
		} else {
			balance -= amount;
			return true;
		}
	}

	public boolean transfer(int amount, BankAccount otherAccount) {
		if (balance < amount) {
			return false;
		} else {
			balance -= amount;
			otherAccount.balance += amount;
			return true;
		}
	}

	public String toString() {
		return "잔액: " + getBalance();
	}
	
	public abstract String getAccountType(); //계좌종류를 반환하는 추상메소드
}