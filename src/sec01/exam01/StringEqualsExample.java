package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1="최승철";
		String strVar2="최승철"; //동일한 문자열 리터럴로 생성된 객체를 참조
		
		if(strVar1==strVar2) {//변수에 저장된 객체의 번지가 동일한지 검사
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3=new String("최승철");
		String strVar4=new String("최승철"); //new 연산자로 String 객체를 별도로 생성
		
		if(strVar3==strVar4) { 
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) { //동일한 객체이건 다른 객체이건 상관없이 내부 문자열을 비교하고 싶을 때
			System.out.println("strVa3과 strVar4는 문자열이 같음");
		}
		
		
		
		
		if(strVar1==strVar4) {
			System.out.println("strVar1과 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar4는 참조가 다름");
		}
		
		if(strVar1.equals(strVar4)) {
			System.out.println("strVa1과 strVar4는 문자열이 같음");
		}
		

	}

}
