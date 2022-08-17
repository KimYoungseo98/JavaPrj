package sec01.exam01;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1=new Member("blue");
		Member obj2=new Member("blue");
		Member obj3=new Member("red");
		
		if(obj1.equals(obj2)) { //매개값이 member타입으로 같고 id필드값도 동일하므로 true
			System.out.println("obj1과 2는 동등합니다.");
		}else {
			System.out.println("obj1과 2는 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 3은 동등합니다.");
		}else {
			System.out.println("obj1과 3은 동등하지 않습니다.");
		}

	}

}
