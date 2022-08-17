package sec02.exam09;

public class ArrayCopyExample {

	public static void main(String[] args) {
	/*	int[] arr1 = { 3, 5, 4, 7, 8, 9, 3, 1, 0, 2 };
		int[] arr2 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// System.arraycopy(src, srcPos, dest,destPos, length);
		System.arraycopy(arr1, 2, arr2, 4, 5);
		System.out.println(arr2); // 주소만 출력됨
		for (int data : arr2) {
			System.out.print(data);
		}
		*/
		String[] oldArray= {"권순영","문준휘","전원우","이지훈" };
		String[] newArray=new String[5];
		
		System.arraycopy(oldArray, 0, newArray, 0, 2);
		for(int i=0; i<newArray.length; i++) {
			System.out.println(newArray[i]+",");
		}
	}

}
