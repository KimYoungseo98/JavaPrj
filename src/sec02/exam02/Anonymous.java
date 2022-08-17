package sec02.exam02;

public class Anonymous {
	RemoteControl field=new RemoteControl() { //필드 선언과 초기값 익명객체 대입
		public void turnOn() {
			System.out.println("Tv를 켭니다");
		}
		public void turnOff() {
			System.out.println("Tv를 끕니다");
		}
	};
	void method1() {
		RemoteControl localVar=new RemoteControl() { //로컬 변수값으로 대입
			public void turnOn() {
				System.out.println("Audio를 켭니다");
			}
			public void turnOff() {
				System.out.println("Audio를 끕니다");
			}
		};
		localVar.turnOn();
	}
	void method2(RemoteControl rc) {
		rc.turnOn();
	}

}
