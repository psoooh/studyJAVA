package chapter10.exercise;
public class CheckingAccount extends BankAccount {

	private SavingsAccount protectedBy;

	public CheckingAccount(int balance) {
		super(balance);
		super.balance = balance;
	}

	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance); //super.balance = balance; 이 문장이 포함되어 있다 굳이 중복해서 쓸 필요없음
		
		this.protectedBy = protectedBy;
	}
 /**
  * 츨금메소드
  * 만약 체크계좌에 10,000원이 있고, 저축계좌에 50,000원이 있다고 가정
  * 35,000원의 물건을 구매한다고 하면
  * 35,000-10,000=2,5000원을 저축계좌에서 빼주고
  * 체크계좌는 0원으로 만든다.
  * amount는 이체할 금액
  */
	@Override
	public boolean withdraw(int amount) {
		if (amount > balance) {
			protectedBy.withdraw(amount - balance); //SavingAccount주소값을 갖고 있는 protecedBy저축계좌에서 출금할거다! 이걸 protectedby.withdraw로 
			balance = 0;
			return true;
		} 
			return super.withdraw(amount);
		}
		
	@Override
	public String getAccountType() { //추상메소드 구현
		return "당좌예금";
	}
	
	
}