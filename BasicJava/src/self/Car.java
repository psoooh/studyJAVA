package self;

public class Car {

	int gas;

	void setGas(int gas) { // 매개값을 받아서 필드값을 변경
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다");
			return false;
		} else {
			System.out.println("gas가 있습니다");
			return true;
		}
	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다.(gsa잔량: " + gas + ")");
				gas--;
			} else {
				System.out.println("멈춥니다.(gas잔량: " + gas + ")");
				return;
			}
		}
	}
}
