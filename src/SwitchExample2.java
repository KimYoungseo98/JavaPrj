import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {
		//메뉴:(I)nsert, (U)pdate, (D)elete, (List)
		//i,I,ㅑ 가 눌려지면 Insert 메뉴를 선택한 것으로 간주함
		System.out.println("메뉴를 선택하세요");
		System.out.println("메뉴:(I)nsert, (U)pdate, (D)elete, (List)");
		
		Scanner scanner=new Scanner(System.in);
		String menu=scanner.nextLine();
		switch(menu.toUpperCase()) {
//		case "i":
		case "I":
		case "ㅑ":
//		case "insert":
		case "INSERT":
//		case "Insert":
			System.out.println("Insert");
			break;
		case "U":
		case "ㅕ":
		case "UPDATE":
			System.out.println("Update");
			break;
		case "D":
		case "ㅇ":
		case "DELETE":
			System.out.println("Delete");
			break;
		case "L":
		case "ㅣ":
		case "LIST":
			System.out.println("List");
			break;
		default:
			System.out.println("메뉴 입력이 잘못되었습니다.");
		
		}
	}

}
