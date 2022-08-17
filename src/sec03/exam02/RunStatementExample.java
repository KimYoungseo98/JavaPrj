package sec03.exam02;

public class RunStatementExample {
	public static void main(String[] args) { //main+ctr+spacebar
		
		int x=1;
		int y=2;
		int z=3;
		int result=x+y;
		System.out.println(result);
		
		//메서드 안에 선언한 변수는 지역변수
		//지역변수는 사용하기 전에 반드시 초기화 해야 함.
		//int value;
		//int result2=value+10;   X
		
		//변수는 실제 값처럼 연산에 사용할 수 있다.
		int hour=3;
		int minute=5;
		int totalMinute=(hour*60)+minute;
		System.out.println(totalMinute);
		
		//변수에 새로운 값을 할당하면 이전값은 즉시 사라진다.
		hour=5;
		int x1=3;
		int y1=5;
		//x1=y1;
		//System.out.println(x1); //5
		int temp=0;
		temp=x1;
		x1=y1;
		y1=temp;
		System.out.println("x1:"+x1+" y1:"+y1); //x:5 y:3
		

	}

}
