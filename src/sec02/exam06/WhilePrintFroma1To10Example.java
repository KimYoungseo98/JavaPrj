package sec02.exam06;

public class WhilePrintFroma1To10Example {

	public static void main(String[] args) {
//		int i=1;
//		while(i<=10) {
//			if(i==5) {
//				break;
//				//continue;
//			}
//			System.out.println(i);
//			i++;
//		}

		for(int i=0; i<3; i++) {
			for(int j=1; j<3; j++) {
				if(i==j) {
					break; //안쪽 반복문을 빠져나간다
					//continue;
				}
				System.out.println(i+" "+j);
			}
		}
	}

}
