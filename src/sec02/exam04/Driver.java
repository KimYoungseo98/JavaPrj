package sec02.exam04;

public class Driver {
	public void drive(Vehicle vehicle) { //자식 객체를 매개값으로 사용 가능
		vehicle.run(); //자식 객체가 재정의한 run메소드 실행
	}

}
