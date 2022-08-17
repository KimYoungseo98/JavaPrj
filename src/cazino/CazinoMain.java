package cazino;

import java.util.Date;
import java.util.Scanner;

public class CazinoMain {
	public static void main(String[] args) {
		IUserService userService = new UserService();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("----------------------------------------------");
			System.out.println("| 1.회원가입 | 2.로그인 | 3.등수 | 4.유저삭제 | 0.종료 |");
			System.out.println("----------------------------------------------");
			System.out.print("선택>");
			String input = scanner.nextLine();

			switch (input) {
			case "1":
				User user = new User();
				System.out.print("ID> ");
				user.setUserID(scanner.nextLine());
				System.out.print("password> ");
				user.setPassword(scanner.nextLine());
				user.setDate(new Date());
				user.setMoney(10000);
				userService.createUser(user);
				break;

			case "2":
				System.out.print("ID> ");
				String loginUserID = scanner.nextLine();
				System.out.print("password> ");
				String loginPassword = scanner.nextLine();
				boolean isError = userService.login(loginUserID, loginPassword);
				if (!isError) {
					break;
				}
				MyPage.Game();
				userService.logout();
				break;

			case "3":
				userService.getList();
				break;

			case "4":
				System.out.print("삭제할 ID> ");
				String deleteUserID = scanner.nextLine();
				System.out.print("password> ");
				String deletePassword = scanner.nextLine();
				userService.deleteUser(deleteUserID, deletePassword);

			case "0":
				System.out.println("종료합니다.");
				userService.save();
				System.exit(0);
				break;

			default:
				System.out.println("잘못된 입력.");
				break;
			}
		}
	}
}