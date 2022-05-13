package chapter10;

public class ClassExample {
	public static void main(String[] args) {
		try {
			Class sClass = Class.forName("chapter07.Student"); //= Student.class.getClass(); = new Student().getClass();
			System.out.println(sClass.getName());
			System.out.println(sClass.getSimpleName());
			System.out.println(sClass.isInterface());
			
			System.out.println("메소드갯수: "+ sClass.getMethods().length);//퍼플릭인 메소드만 다 가져옴
			System.out.println("필드갯수: " + sClass.getFields().length);//퍼블릭인 필드만 다 가져옴
			System.out.println("필드갯수: " + sClass.getDeclaredFields().length);//프라이빗필드 가져옴
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
