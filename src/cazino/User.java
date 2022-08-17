package cazino;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	private static final long serialVersionUID = 5894281402044602118L;

	private int userNumber;
	private String userID;
	private String password;
	private int money;
	private Date date;

	public User(int userNumber, String userID, String password, int money, Date date) {
		super();
		this.userNumber = userNumber;
		this.userID = userID;
		this.password = password;
		this.money = money;
		this.date = date;
	}

	public User() {
		super();
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "user [ userNumber=" + userNumber + ", userId=" + userID + ", password=" + password + ", money=" + money
				+ ", date=" + date + "]";
	}

}
