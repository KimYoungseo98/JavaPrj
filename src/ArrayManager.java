import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ArrayManager {

	public static void main(String[] args) {
		// 정수값만 저장하는 배열 생성
		int[] array = new int[10];

		// 배열의 참조할 인덱스를 같이 생성, 초기값은 -1로 맨처음 인덱스는 0이므로 아무것도 가르키지 않기위해
		int index = -1;

		// 배열에 저장된 데이터의 개수를 저장할 변수, 초기값음 0
		int count = 0;

		Scanner scanner = new Scanner(System.in);
		// 배열의 데이터를 입력, 수정, 삭제, 조회(전체)하는 메뉴를 작성하고 입력받음
		// 메뉴: 1.입력 | 2.수정 | 3.삭제 | 4.조회 | 5.삽입 | 0.종료
		// 1이 입력되면 입력할 데이터
		// 2가 입력되면 수정할 인덱스와 데이터
		// 3이 입력되면 삭제할 인덱스
		// 4가 입력되면 저장된 데이터 출력
		// 5가 입력되면 삽입할 인덱스와 데이터
		System.out.println("********배열 관리 프로그램*********");
		while (true) {
			System.out.println("------------------------------------------");
			System.out.println(" 1.입력 | 2.수정 | 3.삭제 | 4.조회 | 5.삽입 | 0.종료 ");
			System.out.println("------------------------------------------");
			System.out.println("메뉴: ");
			int menu = scanner.nextInt();
			switch (menu) {
			case 1:
				System.out.println("배열에 입력할 데이터: ");
				int inputData = scanner.nextInt();
				array[count] = inputData;
				count++;
				break;
			case 2:
				System.out.println("수정할 데이터의 인덱스와 새 값 입력(ex:2 30) ");
				index = scanner.nextInt();
				int updateData = scanner.nextInt();
				array[index] = updateData;
				break;

			case 3:
				System.out.println("삭제할 인덱스 입력");
				index = scanner.nextInt();
				int deletedData = array[index];
				System.out.printf("%d 위치의 데이터  %d 삭제 \n", index, deletedData);
				for (int i = index; i < count - 1; i++) {
					array[i] = array[i + 1];
				}
				count--;
				break;
			case 4:
				System.out.println("배열의 데이터를 출력합니다.");
				for (int i = 0; i < count; i++) {
					System.out.print(array[i] + "\t");
				}
				System.out.println();
				break;
			case 5:
				System.out.println("삽입할 위치와 데이터 입력(예:2 30)");
				index = scanner.nextInt();
				int insertData = scanner.nextInt();
				for (int i = count; i > index; i--) {
					array[i] = array[i - 1];
				}
				array[index] = insertData;
				count++;
				break;

			case 0:
				scanner.close();
				System.out.println("배열 관리 프로그램을 종료합니다.");
				System.exit(0);

			}// end switch
		} // end while

	}// end main

}// end class
