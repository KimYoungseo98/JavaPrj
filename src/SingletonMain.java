
public class SingletonMain {

	public static void main(String[] args) {
		Singleton s1= Singleton.getInstance();
		Singleton s2=Singleton.getInstance(); //둘은 같은 객체를 참조하고있음
		System.out.println(s1);
		System.out.println(s2);
	}

}
