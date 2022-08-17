
public class BankAccount {
	int balance; //멤버변수, 인스턴스 변수
	static final int value=0; //멤버변수, 정적변수
	public BankAccount() {
		//생성자
	}
	
	public void deposit(int amount) {
		balance+=amount;
	}//입금을 처리하는 메서드
	
	public void withdraw(int amount) {
		balance-=amount;
	}//출금을 처리하는 메서드
	
	
}
