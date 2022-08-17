package cazino;

import java.util.Scanner;

public class MyPage {

	static Scanner scanner = new Scanner(System.in);
	IUserService userService = new UserService();

	public static void Game() {
		gameStart: while (true) { // label
			System.out.println("안녕하세요 " + UserService.currUser.getUserID() + "님 현재 잔고는 "
					+ UserService.currUser.getMoney() + "원 입니다.");
			System.out.println("|1.주사위 게임 | 2.홀짝 게임  | 3.가위바위보 | 4.로그아웃 ");
			System.out.print("선택> ");
			int menu = Integer.parseInt(scanner.nextLine());

			switch (menu) {
			case 1:
				System.out.println("주사위게임을 실행하겠습니다.");
				System.out.println("--------------------------------");
				System.out.print("배팅 금액 >");
				int bet = Integer.parseInt(scanner.nextLine());
				if (bet > UserService.currUser.getMoney()) {
					System.out.println("돈이 부족합니다.!");
					break;
				}
				int userDice = 0;
				while (true) {
					System.out.print("당신이 고를 숫자는? >");
					userDice = Integer.parseInt(scanner.nextLine());
					if (userDice <= 0 || userDice >= 7) {
						System.out.println("다시 입력하세요.");
						continue;
					} else
						break;
				}

				int dice = (int) (Math.random() * 6) + 1;
				System.out.println("정답은 ??? " + dice);

				if (userDice == dice) {
					UserService.currUser.setMoney(UserService.currUser.getMoney() + bet * 5);
					System.out.println("*************축하합니다***************");
				} else {
					UserService.currUser.setMoney(UserService.currUser.getMoney() - bet);
					System.out.println("ㅋㅋㅋㅋㅋㅋㅋㅋㅋ실패하셨군요ㅋㅋㅋㅋㅋㅋㄱㅅ");
					System.out.println("돈을" + bet + "만큼 잃었습니다.");
				}
				break;
			case 2:
				System.out.println("홀짝 게임을 실행하겠습니다.");
				System.out.println("======================================");
				System.out.print("배팅 금액 >");
				bet = Integer.parseInt(scanner.nextLine());
				if (bet > UserService.currUser.getMoney()) {
					System.out.println("돈이 부족합니다.!");
					break;
				}
				int userChoice = 0;
				while (true) {
					System.out.print("당신이 고를 것은? | 1.홀  | 2.짝  |> ");
					userChoice = Integer.parseInt(scanner.nextLine());
					if (userChoice != 1 && userChoice != 2) {
						System.out.println("다시 입력하세요.");
						continue;
					} else
						break;
				}

				dice = (int) (Math.random() * 2) + 1;

				if (dice % 2 == 0) {
					System.out.println("정답은 ??? 짝수입니다.");
				} else {
					System.out.println("정답은 ??? 홀수입니다.");
				}

				if (userChoice % 2 == dice % 2) {
					UserService.currUser.setMoney(UserService.currUser.getMoney() + bet);
					System.out.println("*************축하합니다***************");
				} else {
					UserService.currUser.setMoney(UserService.currUser.getMoney() - bet);
					System.out.println("ㅋㅋㅋㅋㅋㅋㅋㅋㅋ실패하셨군요ㅋㅋㅋㅋㅋㅋㄱㅅ");
					System.out.println("돈을" + bet + "만큼 잃었습니다.");
				}

				break;

			case 3:
				System.out.println("가위바위보게임을 실행하겠습니다.");
				System.out.println("--------------------------------");
				System.out.print("배팅 금액 >");
				bet = Integer.parseInt(scanner.nextLine());
				if (bet > UserService.currUser.getMoney()) {
					System.out.println("돈이 부족합니다.!");
					break;
				}
				userChoice = 0;
				while (true) {
					System.out.print("당신이 고를 것은?(1.가위 | 2.바위 | 3.보 ) > ");
					userChoice = Integer.parseInt(scanner.nextLine());
					if (userChoice != 1 && userChoice != 2 && userChoice != 3) {
						System.out.println("다시 입력하세요.");
						continue;
					} else
						break;
				}

				dice = (int) (Math.random() * 3) + 1;
				if (dice == userChoice) {
					System.out.println("비겼습니다");
					if (dice == 1) {
						System.out.println("시스템:가위 \n당신:가위");
					} else if (dice == 2) {
						System.out.println("시스템:바위 \n당신:바위");
					} else {
						System.out.println("시스템:보 \n당신:보");
					}
				} else if (dice == 1 && userChoice == 2) {
					UserService.currUser.setMoney(UserService.currUser.getMoney() + bet);
					System.out.println("*************축하합니다***************");
					System.out.println("시스템:가위 \n당신:바위");

				} else if (dice == 2 && userChoice == 3) {
					UserService.currUser.setMoney(UserService.currUser.getMoney() + bet);
					System.out.println("*************축하합니다***************");
					System.out.println("시스템:바위 \n당신:보");

				} else if (dice == 3 && userChoice == 1) {
					UserService.currUser.setMoney(UserService.currUser.getMoney() + bet);
					System.out.println("*************축하합니다***************");
					System.out.println("시스템:보 \n당신:가위");

				} else if (dice == 1 && userChoice == 3) {
					UserService.currUser.setMoney(UserService.currUser.getMoney() - bet);
					System.out.println("ㅋㅋㅋㅋㅋㅋㅋㅋㅋ실패하셨군요ㅋㅋㅋㅋㅋㅋㄱㅅ");
					System.out.println("시스템:가위 \n당신:보");
					System.out.println("돈을" + bet + "만큼 잃었습니다.");
				} else if (dice == 2 && userChoice == 1) {
					UserService.currUser.setMoney(UserService.currUser.getMoney() - bet);
					System.out.println("ㅋㅋㅋㅋㅋㅋㅋㅋㅋ실패하셨군요ㅋㅋㅋㅋㅋㅋㄱㅅ");
					System.out.println("시스템:바위 \n당신:가위");
					System.out.println("돈을" + bet + "만큼 잃었습니다.");
				} else {
					UserService.currUser.setMoney(UserService.currUser.getMoney() - bet);
					System.out.println("ㅋㅋㅋㅋㅋㅋㅋㅋㅋ실패하셨군요ㅋㅋㅋㅋㅋㅋㄱㅅ");
					System.out.println("시스템:보 \n당신:바위");
					System.out.println("돈을" + bet + "만큼 잃었습니다.");
				}
				break;

			case 4:

				break gameStart; // switch 문을 빠져나와 label이 있는 곳으로 돌아감

			}

		}
	}
}