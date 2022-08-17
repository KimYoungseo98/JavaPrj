package cazino;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class UserService implements IUserService {
	private static final String USER_FILE_NAME = "user.csv";
	static User currUser = null;
	Scanner sc = new Scanner(System.in);
	List<User> userList = new ArrayList<>();// 리스트에 user객체를

	public UserService() {
		this.userList = readUserData();
	}

	@Override
	public void createUser(User user) {
		readUserData();
		if (userList.isEmpty()) {
			user.setUserNumber(1);
		} else {
			if (!validateID(user)) {
				System.out.println("이미 존재하는 아이디 입니다.");
				return;
			}
			User temp = userList.get(userList.size() - 1); //userList의 마지막 인덱스번호를 temp에 저장
			user.setUserNumber(temp.getUserNumber() + 1); //마지막 인덱스번호+1을 회원 번호로 저장
		}
		user.setDate(new Date());
		user.setMoney(10000);
		userList.add(user);
		System.out.println("회원가입 성공");
	}

	public List<User> readUserData() {
		FileInputStream fis = null;
		ObjectInput ois = null;
		try {
			fis = new FileInputStream(USER_FILE_NAME);
			ois = new ObjectInputStream(fis);
			List<User> list = (List<User>) ois.readObject();
			return list;
		} catch (Exception e) {
			e.getMessage();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (Exception e) {
				}
			}
		}
		return null;
	}

	public boolean validateID(User user) {
		for (int i = 0; i < userList.size(); i++) {
			if (user.getUserID().equals(userList.get(i).getUserID())) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean login(String userID, String password) {
		for (int i = 0; i < userList.size(); i++) {
			if (userID.equals(userList.get(i).getUserID())) {
				if (userList.get(i).getPassword().equals(password)) {
					System.out.println("로그인 성공");
					currUser = userList.get(i);
					return true;
				} else
					System.out.println("비밀번호가 틀립니다.");
				return true;
			}
		}
		System.out.println("존재하지 않은 ID");
		return false;
	}

	@Override
	public void logout() {
		for (int i = 0; i < userList.size(); i++) {
			if (currUser.getUserNumber() == userList.get(i).getUserNumber()) {
				userList.get(i).setMoney(currUser.getMoney());
				userList.get(i).setDate(new Date());
				System.out.println("로그아웃 합니다.");
				break;
			}
		}
		currUser = null;
	}

	@Override
	public List<User> getUserList() {
		List<User> list = readUserData();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		return list;
	}

	@Override
	public int getMoneyInfo() {
		return currUser.getMoney();
	}

	@Override
	public void updateMoney(int updatemoney) {
		currUser.setMoney(currUser.getMoney() + updatemoney);
	}

	@Override
	public void save() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(USER_FILE_NAME);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(userList);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (Exception e) {
				}
			}
		}
	}

	@Override
	public void deleteUser(String userID, String password) {

		for (int i = 0; i < userList.size(); i++) {
			if (userID.equals(userList.get(i).getUserID())) {
				if (userList.get(i).getPassword().equals(password)) {
					userList.remove(i);
					System.out.println("삭제 완료");
					return;
				} else
					System.out.println("비밀번호가 틀립니다.");
				return;
			}
		}
		System.out.println("존재하지 않은 ID");
	}

	@Override
	public void getList() {
		int[][] arr = new int[userList.size()][2];
		for (int i = 0; i < userList.size(); i++) {
			arr[i][1] = userList.get(i).getUserNumber();
			arr[i][0] = userList.get(i).getMoney();
		}

		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) {
					return o1[1] - o2[1];
				} else {
					return o1[0] - o2[0];
				}
			}
		});

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$부자 순위$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("|  순위  |\t이름\t|\t잔고 \t|\t\t최근  활동\t\t|");

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy. M. d hh:mm:ss");

		for (int i = userList.size() - 1; i >= 0; i--) {
			if (arr[i][1] == userList.get(i).getUserNumber()) {
				System.out.printf("%5d등%15s%13d원\t\t%s\n", userList.size() - i, userList.get(i).getUserID(),
						userList.get(i).getMoney(), dateFormat.format(userList.get(i).getDate()));

			}
		}
	}

}