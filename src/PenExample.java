
public class PenExample {

	public static void main(String[] args) {
		Pen myPen=new Pen(); //객체 생성
		System.out.println(myPen);
		myPen.color="red";
		myPen.write("Hello");
		
		Pen myPen2=new Pen();
		System.out.println(myPen2);
		myPen.color="blue"; //상태는 행위에 영향을 준다 변수가 바뀌면 메서드의 실행도 바뀔 수 있다.
		myPen.write("안녕");
		SimplePen pen=SimplePen.getInstance();
		SimplePen pen2=SimplePen.getInstance(); //두 객체가 같다
		
		Pen yourPen=new Pen("Yellow"); //매개변수로 전달
		yourPen.write("KOSA");

	}

}
class SimplePen{
	private static SimplePen pen= new SimplePen();
	private SimplePen() {}
	public static SimplePen getInstance() {
		return pen;
	}
}//singleton pattern
