package sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car myCar=new Car();
		
		myCar.setGas(5); //Car클래스의 setGas()메소드 호출
		
		boolean gasState=myCar.isLeftGas(); //isLeftGas()메소드 호출
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}

	}

}
