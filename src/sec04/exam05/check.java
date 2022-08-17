package sec04.exam05;
import java.util.*;
public class check {

	public static void main(String[] args) {
		/*String name0="김자바";
		int age=25;
		String tel="010", tel2="1234", tel3="5678";
		System.out.println("이름: "+name0);
		System.out.print("나이: "+age+"\n");
		System.out.printf("전화: %s-%s-%s",tel,tel2,tel3);
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("첫번째 수: ");
		String strNum1=scanner.nextLine();
		System.out.println("두번째 수: ");
		String strNum2=scanner.nextLine();
		
		int num1=Integer.parseInt(strNum1);
		int num2=Integer.parseInt(strNum2);
		//int num=scanner.nextInt();
		int result=num1+num2;
		System.out.println("덧셈 결과: "+result);*/
		
		
		Scanner scanner1=new Scanner(System.in);
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		String userName=scanner1.nextLine();
		System.out.print("2. 주민번호 앞 6자리: ");
		String personalID=scanner1.nextLine();
		System.out.print("3. 전화번호: ");
		String phoneNumber=scanner1.nextLine();
		System.out.println("[입력한 내용]");
		System.out.println(userName);
		System.out.println(personalID);
		System.out.println(phoneNumber);
		
		
		
		
		
	}

}
