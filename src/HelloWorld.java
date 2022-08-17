
public class HelloWorld {// 한 줄 주석, 클래스 선언부
	//public 클래스는 파일 이름이 클래스 이름과 같아야 한다. 첫 문자 대문자시작, 이어지는 단어 첫 문자 대문자 시작 나머지 소문자
	//public의 의미는 공용, static:객체 생성 없이 실행, void:method 실행 후 아무것도 되돌리지 않는다.
	//main은 메서드 이름, 프로그램이 실행되려면 main메서드가 있어야 함.
	//string[] args: 명령행 인자를 받는 용도
	public static void main(String[] args) { //method 기능이 들어가는 코드
		System.out.println("HelloWorld!"); //화면에 텍스트 출력 후 줄바꿈
		System.out.println("한글");
		//sysout+ctr+spaceBar
		//소스코드작성, 컴파일, 디버깅, 실행
		//실행 run->run as->java application, ctr+f11
		System.out.println("배고파배고파~~"); //세미콜론은 라인의 끝을 의미
		System.out.println("졸려졸려~~");
		System.out.println("나집");

	}
/*
 * 여러 줄 주석
 */
}//자동 들여쓰기 ctr+i
