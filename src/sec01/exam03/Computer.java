package sec01.exam03;

public class Computer extends Calculator{
	@Override //오버라이딩 
	double areaCircle(double r) { //메소드 재정의
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI*r*r;
	}

}
