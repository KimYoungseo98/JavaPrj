
public class Lotto {

	public static void main(String[] args) {
		//int num=(int)(Math.random()*45)+1; ->로또 번호 하나 뽑기
		for (int i=1; i<7; i++) {
			int num=(int)(Math.random()*45)+1;
			System.out.println(num);
		}

	}

}
