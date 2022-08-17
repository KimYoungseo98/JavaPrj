//항상 객체가 한개만 만들어지도록 하는 패턴(디자인 패턴)
public class Singleton {
	//private 제한자 : 접근 제한자, 클래스 안에서만 사용 가능
	//static 제한자: 사용 제한자, 객체 생성 없이 참조 가능
	
	//직접 객체 생성
	private static Singleton instance=new Singleton();
	
	//생성자를 private로 선언, 생성자를 외부에서 호출할 수 없도록, 생성자가 호출되는 만큼 객체가 생성되기 때문에
	private Singleton() {}
	
	public static Singleton getInstance() { //singleton메소드를 호출하는 대신 외부에서 호출가능한 getTnstance에 자신의객체를 리턴
		return instance;
	}
}
