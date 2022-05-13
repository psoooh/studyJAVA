package chapter10.exercise;

public class Bank {

	private Customer[] customers; // 은행의 고객 목록
	private int numberOfCustomers; // 은행의 고객 수

	public Bank() {
		this.customers = new Customer[10];
	}

	public void addCustomer(Customer customer) {
		customers[numberOfCustomers] = customer;
		numberOfCustomers++;
	}

	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public Customer getCustomer(int index) { // 배열의 인덱스번째 customer 객체를 반환
		return customers[index];
	}
}
