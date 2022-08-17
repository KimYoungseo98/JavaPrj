import java.util.*;

public class ch05_exam06 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);


		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println(" 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료  ");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");

			int selecNo = Integer.parseInt(scanner.nextLine());

			if (selecNo == 1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum]; //new연산자 사용
				
			} else if (selecNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = Integer.parseInt(scanner.nextLine());
					System.out.println("");
				}
			} else if (selecNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}

			} else if (selecNo == 4) {
				int max = 0;
				int sum = 0;
				for (int score : scores) {
					sum += score;
					if (max < score) {
						max = score;
					}
				}
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + (double) sum / studentNum);

			} else {
				run = false;
			}
		}
		System.out.println("프로그램 종료.");

	}

}
