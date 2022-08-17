package sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {
		Person p1=new Person("123456789", "피철인");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		p1.name="피두백";
		System.out.println(p1.name);

	}

}
