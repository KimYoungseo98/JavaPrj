package sec02.exam06;

public class InstanceofExample {
	
	public static void method1(Parent parent) {
		if(parent instanceof Child) { //child 타입으로 변환이 가능한지 확인
			Child child=(Child)parent;
			System.out.println("method1-child changed");
		}else {
			System.out.println("method1-child unchanged");
		}
	}
	public static void method2(Parent parent) {
		Child child=(Child)parent;
		System.out.println("method2-child changed");
	}

	public static void main(String[] args) {
		Parent parentA=new Child();
		method1(parentA); //Child 객체를 매개값으로 전달
		method2(parentA);
		
		Parent parentB=new Parent();
		method1(parentB); //Parent 객체를 매개값으로 전달
		//method2(parentB); //예외 발생

	}

}
