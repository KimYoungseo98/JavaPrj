package sec04.exam02;

public class computerExample {

	public static void main(String[] args) {
		Computer com=new Computer();
		System.out.println(com.sum(3,4));
		System.out.println(com.sum(3,4,5));
		//System.out.println(com.sum(3,4,5,6)); 에러
		System.out.println(com.sum1(new int[]{2,3,4,5}));
		System.out.println(com.sum(1,2,3,4,5,6));

	}

}
