
public class MyClassMain {

	public static void main(String[] args) {
		MyClass obj1=null;
		System.out.println("-----");
		obj1=new MyClass(100);
		MyClass obj2=new MyClass(200);
		obj1.printInfo();
		System.out.println("=====");
		obj2.printInfo();

	}

}
