package sec02.exam05;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
//		for (int i = 2; i < 10; i++) {
//			System.out.println("*** " + i + "단 ***");
//			for (int j = 1; j < 10; j++) {
//				System.out.println(i + "X" + j + "=" + i * j);
//			}
//		}
		
		for(int n=1; n<10; n++) {
			for(int dan=2; dan<10; dan++) {
				System.out.printf("%dx%d=%2d\t", dan,n,dan*n);
			}
			System.out.println();
		}
	}

}
