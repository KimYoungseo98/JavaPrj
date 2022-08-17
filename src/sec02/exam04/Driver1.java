package sec02.exam04;

public class Driver1 {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) { //강제타입변환해도 괜찮은지 확인(Bus가 인터페이스타입으로 변환된 객체인지)
			Bus bus=(Bus) vehicle;
			bus.checkFare(); //bus타입으로 강제 타입 변환을 하는 이유
		}
		vehicle.run();
	}

}
