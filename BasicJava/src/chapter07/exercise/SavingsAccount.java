package chapter07.exercise;
public class SavingsAccount extends BankAccount {

	private double interestRate; // 이자율

	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		super.balance = balance;
		this.interestRate = interestRate;
	}

	// 저축기간을 인자로 받아 이자를 계산하여 잔액에 추가
	// 이자는 단리법을 따름( 단리 원리금: 원금*이율*기간+원금)
	public void updateBalance(int period) {
		super.balance += balance * interestRate * period;
	}
	
	@Override
	public String getAccountType() { //저축예금 반환
		return "저축예금";
	}

}