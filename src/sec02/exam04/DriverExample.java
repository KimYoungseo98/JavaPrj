package sec02.exam04;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver=new Driver();
		Bus bus=new Bus();
		Taxi taxi= new Taxi();
		
		driver.drive(bus); //자동 타입 변환 Vehicle vehicle=bus; 부모에 선언된 필드와 메소드만 사용가능함
		driver.drive(taxi);// Vehicle vehicle=taxi;

	}

}
