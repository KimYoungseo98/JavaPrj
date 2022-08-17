package sec04.exam05;

public class CarExample {

	public static void main(String[] args) {
		Car myCar= new Car(); //클래스 외부에서 메소드 호출하기 위해 생성자 생성
		
		myCar.keyTurnOn();
		myCar.run();
		int speed=myCar.getSpeed();
		System.out.println("현재 속도: "+speed+"km/h");

	}

}
