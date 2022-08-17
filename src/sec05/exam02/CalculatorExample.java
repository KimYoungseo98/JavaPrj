package sec05.exam02;

public class CalculatorExample {

	public static void main(String[] args) {
		double result1=10*10*Calculator.pi;
		int result2=Calculator.plus(10, 5);
		int result3=Calculator.minus(10, 5); //원칙적으로느 이렇게 클래스이름으로 접근
		
		Calculator myCalc=new Calculator();
		int result0=myCalc.plus(10, 5); //객체 참조변수로도 접근 가능
		
		System.out.println("result1: "+result1);
		System.out.println("result2: "+result2);
		System.out.println("result3: "+result3);
		

	}

}
