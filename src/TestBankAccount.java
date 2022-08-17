
public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount account=new BankAccount(); //BankAccount 클래스를 이용한 참조변수 ->heap에 저장
		account.balance=10000;
		account.deposit(20000);
		System.out.println(account.balance);
		account.withdraw(15000);
		System.out.println(account.balance);
		
		int data=30000; //지역변수(반드시 초기화해서 사용)->stack에 저장
		int[] scores= {10,20,30};
		//stack(주소)의 값을 비교하는== heap의 값을 비교하는 .equals()
		
		BankAccount acc2=null; 
		System.out.println(acc2); //null
		acc2=new BankAccount();
		acc2.deposit(10000); //메서드 호출 ->null point exception발생
		System.out.println(acc2);
		

	}

}
