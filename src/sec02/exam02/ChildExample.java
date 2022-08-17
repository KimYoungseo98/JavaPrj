package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		
		Child child=new Child();
		
		child.method3();
		Parent parent=child; //자동 타입 변환
		parent.method1();
		parent.method2();
		// parent.method3(); 호출불가능
		child.method3();

	}

}
