package exercise;

public class BankAccount {
	
	private int balance; //잔액
	
	public BankAccount(int balance) { 
		this.balance = balance;
	}
	
	public int getBalance() { //현재 계좌의 잔액
		return balance;
	}
	
	public void deposit(int amount) { //입금 메소드
		balance += amount;
	}
	
	public boolean withdraw(int amount) { //출금 메소드
		balance -= amount;
		return true;
		
	}
	//현재계좌에서 amount만큼을 다른 계좌로 송금하는 메소드
	public boolean transfer(int amount, BankAccount otherAccount) {
		if (balance < amount) {
			return false;
		} else {
			balance -= amount;
			otherAccount.balance += amount;
			return true;
			
		
		}
	}
}
