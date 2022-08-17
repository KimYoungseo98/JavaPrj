package sec03.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog=new Dog();
		Cat cat= new Cat();
		
		System.out.println("강아지----------");
		System.out.println(dog.kind);
		dog.cute();
		dog.sound();
		System.out.println("--------------");
		
		Animal ani=null;
		ani=new Dog(); //변수의 자동 타입 변환 및 재정의된 메소드 호출
		ani.sound(); //자식에 메서드가 재정의되었을 경우 재정의된 메서드 호출
		ani=new Cat();
		ani.sound();
		System.out.println("--------------");
		
		//메소드의 다형성
		animalSound(new Dog()); //부모타입 매개변수에 자식 객체를 대입해 자동타입변환되어 재정의된 메소드 호출
		animalSound(new Cat()); //ani로 자동 타입 변환

	}

	public static void animalSound(Animal ani) {
		ani.sound(); //재정의된 메소드 호출
		
	}
	

}
