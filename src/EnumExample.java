
public class EnumExample {

	public static void main(String[] args) {
		Week today=Week.Thursday;
		System.out.println(today);
		
		//enum이 나오기 전 방법은 클래스의 상수를 이용했었음
		int today2=MyWeek.MONDAY;
		int today3=3;
	}

}
class MyWeek{
	public static final int MONDAY=1; //상수를 정의함
	public static final int THUESDAY=2;
}
