package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		
		Parent parent=new Child(); //자동 타입 변환
		//Patent parent=new Patent(); 처럼 처음부터 부모 타입으로 생성된객체는 자식 타입으로 변환할 수 없다
		
		parent.field1="data1";
		parent.method1();
		parent.method2();
		
//		parent.field2="data2";
//		parent.method3();  //불가능
		
		Child child=(Child)parent; //강제 타입 변환
		
		child.field2="data2";
		child.method3();
		

	}

}
