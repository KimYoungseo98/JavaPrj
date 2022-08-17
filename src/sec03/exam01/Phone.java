package sec03.exam01;

public class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner=owner;
	}
	
	public void turnOn() {
		System.out.println("turn on");
	}
	public void turnOff() {
		System.out.println("turn off");
	}
}
