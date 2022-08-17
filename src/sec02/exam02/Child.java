package sec02.exam02;

public class Child extends Parent{
	@Override //재정의
	public void method2() {
		System.out.println("child method2");
	}
	
	public void method3() {
		System.out.println("child method3");
	}
}
