package sec03.exam02;

public abstract class Animal {//추상클래스
	public String kind;
	
	public void cute() {
		System.out.println("너무너무 귀엽다~~~");
		
	}
	public abstract void sound(); //추상메소드는 항상 추상클래스에

}
