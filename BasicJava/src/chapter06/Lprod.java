package chapter06;

//Value Object(VO: 값을 가지고 있는 객체):현업에서 쓰는표현
//Date Transfer Object(DTO: 데이터를 운반해주는 객체):원래는 요고야
//model(데이터)
//Item(항목, 안드로이드 분야에서 많이 사용했었다, 요즘은 잘 안쓰는 추세)
//Bean(커피콩, 객체)
public class Lprod {
	//필드
	private int lprodId;
	private String lprodGu;
	private String lprodNm;
	
	//메소드생성, 메소드를 통해 접근하게 되는 방식으로 간다(getter와 setter)
	public int getLprodId(){
		return lprodId;
	}
	public void setLprodId(int lprodId) {
		this.lprodId = lprodId;
	}
	public String getLprodGu(){
		return lprodGu;
	}
	public void setLprodGu(String lprodGu) {
		this.lprodGu = lprodGu;
	}
	public String getLprodNm(){
		return lprodNm;
	}
	public void setLprodNm(String lprodNm) {
		this.lprodNm = lprodNm;
	}
}
