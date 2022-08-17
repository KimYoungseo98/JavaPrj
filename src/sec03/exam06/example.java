package sec03.exam06;

public class example {

	public static void main(String[] args) {
		System.out.println("Hello"+"World");
		System.out.println("Hello"+100);
		System.out.println("Hello"+100+200);
		System.out.println("Hello"+(100+200));
		System.out.println(100+200+"Hello");
		System.out.println("100"+"200");
		
		String s1="100";
		String s2="200";
		//Byte,Short,Integer,Long,Float,Double,Character,Boolean - wrapper class
		int a=Integer.parseInt(s1);
		short b=Short.parseShort(s2);
		System.out.println(a+b);
		
		String s3="가";
		char c=s3.charAt(0);
		System.out.println(c);
		
		String s4="true";
		boolean d=Boolean.parseBoolean(s4);
		System.out.println(d);
		
		//byte는 char에 넣을 수 없음 char은 음수가 없기 때문
		//byte result=(byteValue+byteVlaue) //byteValue=10;
		//int x; inty;
		//double resutl=(double)x/y; 정수의 계산이 실수가 되게 하고 싶을 때
		//int result=(int)(var1+var2+var3+Double.parseDouble(var4))
		
		String str1=2+2+""+5;
		System.out.println(str1);
		System.out.println("개미는 뚠뚠 오늘도 뚠뚠 열심히 일을 하네 뚠뚠");
		
		

	}

}
