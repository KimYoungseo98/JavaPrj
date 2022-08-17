
public class Pen {
	//객체를 추상화->클래스
	String color="black"; //멤버변수(필드)
	int price;
	public Pen() { //기본생성자,인수가 하나도 없는
		super();
	}
	public Pen(String color) { //중복정의, 매개변수가 달라야 함
		this(color,1000);
		//this.color=color; //현재  객체의 color에다가 인수로 전달된 color(Yellow)를 넣어주세요
	}
	public Pen(String color, int price) { //매개변수를 추가하면 기본 생성자를 이용한 코드가모두 오류난다
		//this는 생성자의 첫라인에 와야한다                     //기본생성자를 추가해주어야 한다
		this.color=color;
		this.price=price;
	}
	public void write(String message) { //메서드+ (매개변수)
		int a=10; //지역변수 반드시 초기화 후 사용해야 함.
		System.out.println(price); //기본값인 0
		System.out.println(this.color+"펜을 사용합니다."); //멤버변수는 this.를 붙여 자기 자신의 객체임을 표시한다.
		System.out.println(message+"출력");
	}
	
}
