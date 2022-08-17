package sec02.exam04;

public class Driver1Example {

	public static void main(String[] args) {
		Driver1 driver=new Driver1();
		
		Bus bus=new Bus();
		Taxi taxi= new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);

	}

}
