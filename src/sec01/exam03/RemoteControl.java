package sec01.exam03;

public interface RemoteControl {
	//상수
	public int MAX_VOLUME=10; //인터페이스에 선언된 상수는 모두 public static final의 특성을 가짐
	public int MIN_VOLUME=0; //반드시 선언과 동시에 초기값을 지정해야 함
	
	//추상메소드
	public void turnOn(); //최종적을 객체에서 실행되기 때문에 실행블록이 없는 추상 메소드로 선언함
	public void turnOff(); //public abstract의 특성을 가짐
	public void setVolume(int volume);
	
	//객체를 생성할 수 없기 대문에 생성자를 가질 수 없음
	//개발 코드가 인터페이스의 메소드를 호출하면 인터페이스는 객체의 메소드를 호출시킴
	//인터페이스는 객체 사용방법을 정의한 것이므로 인스턴스 또는 정적 필드를 선언할 수 없으나 상수 필드는 선언이 가능함
	
	
}
