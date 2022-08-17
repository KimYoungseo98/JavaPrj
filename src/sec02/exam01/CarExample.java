package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar=new Car("빨강", 3000); //객체 생성  Car클래스의 필드를 참조하기 위해
		
		System.out.println("제작회사: "+myCar.company);
		System.out.println("모델명: "+myCar.model);
		System.out.println("현재속도:"+myCar.speed);
		
		myCar.speed=60; //필드값 변경
		System.out.println("변경된 속도: "+myCar.speed);
		System.out.println(myCar.color);

	}

}
