package sec02.exam02;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores; //미리선언만
		scores=new int[] {83,90,87}; //new 연산자를 사용해서 값 목록을 지정
		int sum1=0;
		for(int i=0; i<3; i++) {
			sum1+=scores[i];
		}
		System.out.println("총합: "+sum1);
		
		int sum2=add(new int[] {83,90,87}); //값 목록으로 배열을 생성하는 동시에 add메소드의 매개값으로 사용할 때도 new 사용
		System.out.println("총합: "+sum2);
		System.out.println();
		

	}

	public static int add(int[] scores) { //총합을 계산해서 리턴하는 메소드
		int sum=0;
		for(int i=0; i<3; i++) {
			sum+=scores[i];
		}
		return sum;
	}

}
