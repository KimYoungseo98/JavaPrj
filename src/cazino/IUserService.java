package cazino;

import java.util.List;

public interface IUserService {
//   List<User> userList = User

	void createUser(User user);

	boolean login(String userID, String password);

	void logout();

	List<User> getUserList();

	int getMoneyInfo();

	void updateMoney(int updateMoney);

	void save();

	void deleteUser(String userID, String password);

	void getList();

}