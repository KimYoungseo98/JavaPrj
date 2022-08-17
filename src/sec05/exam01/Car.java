package sec05.exam01;

public class Car {
	String model;
	int speed;
	
	Car(String model){ //생성자
		this.model=model;
	}
	void setSpeed(int speed) { //메소드
		this.speed=speed;
	}
	void run() {
		for(int i=0; i<=50;i+=10) {
			this.setSpeed(i);
			System.out.println(this.model+"가 달립니다.(시속:"+this.speed+"km/h)");
		}
	}

}
