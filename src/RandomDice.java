
public class RandomDice { //확인문제 3번

	public static void main(String[] args) {

/*		while (true) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + num1 + "," + num2 + ")");
			if (num1 + num2 == 5) {
				System.out.println("두 주사위의 합이 5가 나왔습니다.");
				break;
			}
		}

		// 3의 배수의 총합을 구하는
		int i = 0;
		int num = 0;
		for (i = 0; i <= 100; i++) {
			if (i % 3 == 0) {
				num += i;
			}
			System.out.println("sum= "+num);
		}*/
		
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=10; j++) {
				if((4*i+5*j)==60) {
					System.out.println("("+i+","+j+")");
				}
			}
		}

	}

}
