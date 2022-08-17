package com.kosa.myapp.in;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceMain {

	public static void main(String[] args) {
		int index = -1;
		CustomerService custService = new CustomerService();
		List<Customer> custList=new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("=======================메뉴를 입력하세요======================");
			System.out.println("(I)nsert, (P)revious, (N)ext, (U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴>");
			char menu = scanner.nextLine().trim().charAt(0);
			switch (menu) {
			case 'I':
			case 'i':
			case 'ㅑ':
				Customer customer = new Customer();
				System.out.print("이름> ");
				customer.setName(scanner.nextLine());
				System.out.print("설명> ");
				customer.setGender(scanner.nextLine().charAt(0));
				System.out.print("이메일> ");
				customer.setEmail(scanner.nextLine());
				System.out.print("출생년도> ");
				customer.setBirthYear(Integer.parseInt(scanner.nextLine()));
				custService.insertCustomer(customer);
				break;
			case 'P':
			case 'p':
			case 'ㅔ':
				if (index > 0) {
					index--;
					Customer prevCust = custService.getCustomer(index);
				} else {
					System.out.println("이전 데이터가 없습니다.");
				}
				break;
			case 'N':
			case 'n':
			case 'ㅜ':
				if (index <custList.size() - 1) {
					index++;
					Customer nextCust = custService.getCustomer(index);
				} else {
					System.out.println("다음 데이터가 없습니다.");
				}
				break;
			case 'U':
			case 'u':
			case 'ㅕ':
				 System.out.print("수정할 회원 번호를 입력하세요> ");
	        	 int updateBno=Integer.parseInt(scanner.nextLine());
	        	 //Customer updateCustomer=CustomerService.getCustomer();
//	        	 System.out.printf("제목: (%10.10s)", updateCustomer.getName());
//	        	 updateCustomer.setTitle(scanner.nextLine());
//	        	 System.out.printf("내용: (%10.10s)", updateCustomer.getGender());
//	        	 updateBoard.setContent(scanner.nextLine());
//	        	 System.out.printf("작성자: (%s)", updateCustomer.getEmail());
//	        	 updateBoard.setWriter(scanner.nextLine());
//	        	 updateBoard.setDate(new Date());
//	        	 boardService.updateBoard(updateBoard);
				
			}
		}

	}

}
