package sec04.exam04;

public class Calculator {
	int plus(int x, int y) { //3 실행
		int result=x+y;
		return result;
	}
	double avg(int x,int y) { //2 실행
		double sum=plus(x,y); //3 호출
		double result=sum/2;
		return result;
	}
	void execute() { //1 실행
		double result=avg(7,10); //2 호출
		println("실행결과: "+result); // 4호출
	}
	void println(String message) {
		System.out.println(message); //4 실행
	}
}
