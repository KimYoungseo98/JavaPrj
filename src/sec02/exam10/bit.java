package sec02.exam10;

public class bit {

	public static void main(String[] args) {
		//비트연산자
		int a=10; //00000000 00000000 00000000 00001010
		int b=6;  //00000000 00000000 00000000 00000110
		System.out.println(a&b); //00000000 00000000 00000000 00000010
		System.out.println(a|b); //00000000 00000000 00000000 00001110
		System.out.println(a^b); //00000000 00000000 00000000 00001100

		int c=1298231345;
		System.out.println(Integer.toBinaryString(c));
		//01001101 01100001 01110000 00110001
		//00000000 11111111 00000000 00000000 &
		//00       FF       00       00
		
		int result=c&0x00ff0000;
		System.out.println(Integer.toBinaryString(result));
		int shifted=result>>16;
		System.out.println(Integer.toBinaryString(shifted));
		System.out.println(shifted);
		System.out.println(Integer.toBinaryString(result<<32));
		
		String s1="Hello";
		String s2= new String("Hello");
		System.out.println(s1.equals(s2)); // 문자열 비교
	}

}
