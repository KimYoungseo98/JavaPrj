package sec04.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		//Calculator 클래스의 메소드를 호출하기 위해 객체 생성
		Calculator myCalc=new Calculator();
		myCalc.powerOn();
		
		int result1=myCalc.plus(5, 6);
		System.out.println("result1: "+result1);
		
		byte x=10;
		byte y=4;
		double result2=myCalc.divide(x, y);
		System.out.println("result2: "+result2);
		
		myCalc.powerOn();

	}

}
