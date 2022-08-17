
public class someclassExample {

	public static void main(String[] args) {
		//doThat(); //static블록에서 non-static멤버를 직접 참조할 수 없다.
		someclassExample obj=new someclassExample(); //객체를 생성해야 참조 가능
		obj.doThat();
		SomeClass obj2=new SomeClass();
		obj2.doSomething();
		SomeClass.doAnything();
		obj2.count++;
		SomeClass.count++;
		new SomeClass().count++;
		System.out.println(SomeClass.count);
		
	}
	 void doThat() {
		System.out.println("doThat");
		SomeClass obj1=new SomeClass();
		obj1.doSomething();
	}

}
