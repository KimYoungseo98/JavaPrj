package sec03.exam02;

public class Dog extends Animal{
	public Dog() {
		this.kind="포유류";
	}
	public void sound() { //추상메소드 재정의
		System.out.println("멍멍"); //추상메소드를 재정의하지 않으려면 자식 클래스도 추상클래스가 되어야 한다
	}

}
