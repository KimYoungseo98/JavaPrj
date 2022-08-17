package sec03.exam02;

	public class Korean {
		String nation = "korea"; //필드
		String name;
		String ssn;
	
	public Korean(String name, String ssn) { //생성자(매개변수)
		this.name=name; //필드와 매개변수의 이름이 동일하면 생성자 내부에서 해당 필드에 접근할 수 없다
		   //필드    매개변수  //매개변수의 사용 우선순위가 더 높기 때문이다.
		this.ssn=ssn; //this.를 붙여 객체 자신을 참조
	}
}
