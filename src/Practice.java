import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		//+****
		//*+***
		//**+**
		//***+*
		//****+
		
		/*for(int i=0; i<5; i++) {
			for(int j=0; j<5;j++) {
				if(i==j) {
					System.out.print("+");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
*/
		//배열의 데이터를 입력, 수정, 삭제, 조회(전체)하는 메뉴를 작성하고 입력받음
				//메뉴: 1.입력 | 2.수정 | 3.삭제 | 4.조회 | 5.삽입 | 0.종료
				//1이 입력되면 입력할 데이터
				//2가 입력되면 수정할 인덱스와 데이터
				//3이 입력되면 삭제할 인덱스
				//4가 입력되면 저장된 데이터 출력
				//5가 입력되면 삽입할 인덱스와 데이터
		
		int[] array=new int[10];
		Scanner scanner=new Scanner(System.in);
		int count=0;
		int index=-1;
		
		while(true) {
			System.out.println("메뉴: 1.입력 | 2.수정 | 3.삭제 | 4.조회 | 5.삽입 | 0.종료");
			System.out.println("메뉴: ");
			int menu=scanner.nextInt();
			switch(menu) {
			case 1:
				System.out.println("입력할 데이터: ");
				int inputData=scanner.nextInt();
				array[count]=inputData;
				count++;
				break;
			case 2:
				System.out.println("수정할 인덱스와 값: ");
				index=scanner.nextInt();
				int updateData=scanner.nextInt();
				array[index]=updateData;
				break;
			case 3:
				System.out.println("삭제할 인덱스: ");
				index=scanner.nextInt();
				for(int i=index; i<count-1; i++) {
					array[i]=array[i+1];
				}
				count--;
				break;
			case 4:
				System.out.println("인덱스조회");
				for(int i=0;i<count; i++) {
					System.out.print(array[i]+"\t");
				}
				System.out.println();
				break;
			case 5:
				System.out.println("삽입할 인덱스와 값: ");
				index=scanner.nextInt();
				int insertData=scanner.nextInt();
				for(int i=count; i>index; i--) {
					array[i]=array[i-1];
				}
				array[index]=insertData;
				count++;
				break;
			case 0:
				System.out.println("프로그램 종료");
				System.exit(0);
			
				
				
			}
		}
		
		
	}

}
