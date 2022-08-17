package sec01.exam08;

import java.util.Scanner;

public class SwitchStringExample {

	public static void main(String[] args) {
		
		System.out.println("직급을 입력하세요.");
		Scanner scanner=new Scanner(System.in);
		
		String position=scanner.nextLine();
		
		switch(position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
			
		}
	}

}
