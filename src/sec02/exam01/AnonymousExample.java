package sec02.exam01;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous an = new Anonymous();
		an.field.wake(); // 익명객체의 필드 사용
		an.method1(); // 익명객체의 로컬변수 사용
		an.method2(
				// 익명 객체의 매개값 사용
				new Person() {
					void study() {
						System.out.println("공부합니다.");
					}

					void wake() {
						System.out.println("8시에 일어납니다");
						study();
					}
				});

	}

}
