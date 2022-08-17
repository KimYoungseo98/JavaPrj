
public class TestCmdLineArgs {

	public static void main(String[] args) {
		//명령행에 인수를 전달하는 ->args로 전달
		System.out.println("main 종료");
		for(String arg:args) {
			System.out.println(arg);
		}
		System.out.println("main 종료");
		

	}

}
