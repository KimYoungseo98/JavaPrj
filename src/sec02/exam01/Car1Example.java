package sec02.exam01;

public class Car1Example {

	public static void main(String[] args) {
		Car1 myCar= new Car1();
		
		myCar.run();
		
		myCar.flTire=new KumhoTire();
		myCar.frTire=new KumhoTire();
		
		myCar.run();

	}

}
