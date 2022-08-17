package sec04.exam01;

import javax.swing.plaf.synth.SynthSeparatorUI;
import java.util.*;

public class test {

	public static void main(String[] args) {
		/*int value=12345;
		System.out.printf("[%d]\n",12345);
		System.out.println("["+12345+"]");
		System.out.printf("[%10d]\n",value);
		System.out.printf("[%-10d]\n",value); //왼쪽정렬
		System.out.printf("[%10s]\n","Hello");
		System.out.printf("[%10.2f]",123.45); //소수점 이하는 반올림될 수 있음*/
		//자바는 전체 자리수에 소수점이 포함이 됨
		
		Scanner scanner=new Scanner(System.in);
	//  클래스명      변수명         키워드생성자(표준입력장치)
		int data2=scanner.nextInt();
		int data3=scanner.nextInt();
		System.out.println(data2 +data3);
		scanner.nextLine();
		String line=scanner.nextLine();
		System.out.println(line);
		scanner.close(); //표준입력장치를 닫아줌
		

	}

}
