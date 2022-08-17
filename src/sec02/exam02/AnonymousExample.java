package sec02.exam02;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();

		anony.field.turnOn(); // 익명객체필드사용
		anony.method1(); //익명객체 로컬변수 사용
		anony.method2(new RemoteControl() {//익명객체 매개값 사용
			public void turnOn() {
				System.out.println("smartTV를 켭니다");
			}

			public void turnOff() {
				System.out.println("smartTV를 끕니ㅣ다");
			}
		});
	}

}
