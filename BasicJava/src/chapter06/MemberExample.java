package chapter06;

public class MemberExample {
	public static void main(String[] args) {
	
	//두 사람의 나이, 이름 정보 저장	
	 Member member1 = new Member(); //new~>생성자를 호출하는 것 //앞은 선언~>멤버라는 클래스가 메모리에 저장해서 멤버1이라는 변수에 데이터를 저장
	 member1.name = "최하얀";
	 member1.age = 23;
	 
	 Member member2 = new Member();
	 member2.name = "연우";
	 member2.age = 4; 
	 //member1과 member2라는 두개의 객체가 만들어 진다
	 
	 Member member3 = new Member("류관순", 15);
	}
}
