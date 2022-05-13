package chapter06;

public class Member {
	String name = null;
	String id;
	String password;
	int age = 0;
	int ssn = 0;
	String nation = null;

public Member() { //() 괄호안에 매개변수가 없는 것을 default기본생성자	
}
public Member(String name) {
	this(name, 0, null, 0);
}

public Member(String name, int age) {
	this(name, age, null, 0);
}

public Member(String name, int age, String nation) {
	this(name, age, nation, 0);
}

public Member(String name, int age, String nation, int ssn) {
	this.name = name;
	this.age = age;
	this.nation = nation;
	this.ssn = ssn;
}
}

/*public Member(String n, int a) { //(매개변수)가 있는 생성자
name = n;
age = a;

}
}

public class Member {
String name;
String id;
String password;
int age;
}이렇게만 클래스 선언하고 필드 생성할때 둘다 없으면 자동으로 기본생성자를 만들어 준다*/