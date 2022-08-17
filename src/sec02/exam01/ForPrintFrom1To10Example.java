package sec02.exam01;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {
//		int i=1;
//		for(; i<+10; i++) {
//			System.out.println(i);
//		}
//		System.out.println(i);

		// 1
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };// 배열
		// arr의 모든 값의 합을 출력
		int sum = 0;
		for (int i = 0; i < 8; i++) {
			sum += arr[i];
		}
		System.out.println(sum);

		// 2
		sum = 0;
		for (int data : arr) {
			sum += data;
		} // enhanced for loop, 구문은: for(변수 선언 : 나열 객체)
		System.out.println(sum);

		// 1과 2의 반복문은 결과가 같다 p.149
	}

}
