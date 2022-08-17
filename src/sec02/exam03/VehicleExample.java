package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle=new Bus(); //구현 객체가 인터페이스로 자동타입변환하면 인터페이스에 선언된 메소드만 사용가능하다는 제약사항이 따른다
		
		vehicle.run();
		//vehicle.checkFare(); //사용불가
		
		Bus bus=(Bus) vehicle; //강제 타입변환
		
		bus.run();
		bus.checkFare(); //사용가능
		

	}

}
