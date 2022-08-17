
public class MyClass {
	int a=10;
	static int b;
	final int c;
	static {
		b=10;
		System.out.println("static initializer");//가장 먼저 실행
	}
	{
		c=20;
		System.out.println("instance initializer");
	}
	public MyClass(int a) {
		this.a=a;
		System.out.println("constructor");
	}
	public void printInfo() {
		System.out.println(a+" "+b+" "+c);
	}
}
