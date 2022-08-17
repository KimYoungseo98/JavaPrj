package sec02.exam01;

public class Car1 {
	Tire flTire=new HankookTire();
	Tire frTire=new HankookTire();
	Tire blTire=new HankookTire();
	Tire brTire=new HankookTire(); //인터페이스 타입 필드 선언과 초기 구현 객체 대입
	
	void run() {
		flTire.roll(); //인터페이스에서 설명된 roll()메소드 호출
		frTire.roll();
		blTire.roll();
		brTire.roll();
	}

}
