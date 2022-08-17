import java.util.*;

public class BankSystem {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.println("선택> ");
			int num = scanner.nextInt();
			if (num == 1) {
				System.out.println("예금액> ");
				balance += scanner.nextInt();
			} else if (num == 2) {
				System.out.println("출금액> ");
				balance -= scanner.nextInt();
			} else if (num == 3) {
				System.out.println("잔고> " + balance);
			} else {
				System.out.println("프로그램 종료");
				//run=false;
				break; 
			}
			/*
			 * int menu=scanner.nextInt();
			 * switch(menu){
			 * case 1:
			 * System.out.print("예금액>");
			 * int depositAmount=scanner.nextInt();
			 * balance+=depositAmount;
			 * break;
			 * case 2:
			 * System.out.print("출금액>");
			 * int withdrawAmount=scanner.nextInt();
			 * balance-=depositAmount;
			 * break;
			 * case 3:
			 * System.out.println("잔고>"+balance);
			 * break;
			 * case 4:
			 * System.out.println("프로그램종료");
			 * System.exit(0);*/
			
		}

	}

}
