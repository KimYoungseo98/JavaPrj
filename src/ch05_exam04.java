
public class ch05_exam04 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = { 5, 3, 8, 2, 9 };

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				max = array[i];
			} else {
				max = array[i + 1];
			}
		}

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("max: " + max);

//		
//		for (int data : array) {
//			if (max < data) {
//				max = data;
//			}
//		}
//
//		System.out.println("max: " + max);
//		
//		
//		int min = 9999;
//		for (int i = 0; i < array.length; i++) {
//			if (min > array[i]) {
//				min = array[i];
//			}
//		}
//		System.out.println(min);

	}

}
