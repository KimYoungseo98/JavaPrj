
public class ArrayExample {

	public static void main(String[] args) {
		int[] intArr= {20,30,40,50,60};
		int sum=0;
		for(int i=0; i<intArr.length; i++) { //배열의 길이만큼
			sum+=intArr[i];
		}System.out.println(sum);
		
		String s1="HellloWorld";
		System.out.println(s1.length());
		
		sum=0;
		for(int data:intArr) {
			sum+=data;
		}
		System.out.println(sum);

	}

}
