package a.b;

public class ClassB {
	public void doIt() {
		ClassA clsA=new ClassA();
		System.out.println(clsA.a);
		System.out.println(clsA.b);
		System.out.println(clsA.c);
		//System.out.println(clsA.d); //d는 private으로 생성해서 다른 클래스에서 참조 불가
	}
}
