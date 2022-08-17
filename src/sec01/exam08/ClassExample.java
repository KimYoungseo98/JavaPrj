package sec01.exam08;

import sec02.exam01.Car;

public class ClassExample {
	public static void main(String[] args) throws Exception {
		//클래스 이름으로 객체 얻기
		Class clazz=Car.class;
		//Class cl=Class.forName("sec01.exam08.Car");
		//Car car=new Car();
		
		//클래스로부터 객체가 이미 생성되었을 경우 class 객체 얻기
		//Class clazz=car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
	}
	
	

}
