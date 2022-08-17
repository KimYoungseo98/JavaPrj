package sec04.exam02;

public class Computer {
	//두 정수의 합을 계산하는 메서드
	public int sum(int num1, int num2) {
		return num1+num2;
	}
	
	//정수 3개의 합을 계산하는 메서드
	public int sum(int num1, int num2, int num3) {
		return num1+num2+num3;
	}

	//...메서드 오버로딩
	//메서드의 이름이 같고 매개변수의 개수, 타입, 순서 달라야 함
	//리턴타입은 무관
	
//	public int sum(int[] values) {
//		int sum=0;
//		for(int value:values) {
//			sum+=value;
//		}
//	if(sum>=0) { if문에서 리턴값을 넣으려면 else블록도 있어야 한다(인수가 음수일경우도있으므로)
//		return sum;
//	}else {
//		return sum;
//	}
//	
//	}
	//매개변수의 개수를 모를경우
	public int sum(int init, int ... values) {//가변인수 ...과 int[]와 같은 취급을 해서 동시에 사용불가
		int sum=0;   //int init은 매개변수가 반드시 하나 들어가야함을 명시함
		for(int value:values) {
			sum+=value;
		}
		return sum;
	}
	
	public int sum1(int[] values) {
		int sum=0;
		for(int i=0; i<values.length; i++) {
			sum+=values[i];
		}
		return sum;
	}
}
