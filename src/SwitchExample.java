import java.util.*;
public class SwitchExample {

	public static void main(String[] args) {
		//메뉴를 입력받고 입력받은 메뉴 문자를 출력하는 예제 코드
		//메뉴를 어떻게 정할 것인가 숫자/문자로 입력받게 할 것인가?
		//고객의 정보를 관리하는 어플리케이션:정보입력, 수정, 삭제, 조회(목록조회,찾기조회,순차조회)
		///1.입력, 2.수정, 3.삭제, 4.조회
		System.out.println("메뉴를 입력하세요. 메뉴: 1.입력  2.수정  3.삭제  4.조회");
		Scanner scanner=new Scanner(System.in);
		int menu=scanner.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("입력");
			break;
		case 2:
			System.out.println("수정");
			break;
		case 3:
			System.out.println("삭제");
			break;
		case 4:
			System.out.println("조회");
			break;
		default:
			System.out.println("메뉴를 잘못 선택했습니다.");
		
		}
	}

}
