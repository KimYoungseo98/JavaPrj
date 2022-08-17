package sec02.exam07;

public class ComparOperatoorExample {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		String s3=new String("Hello");
		String s4=new String("Hello");
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		
		
		int v2=1;
		double v3=1.0;
		System.out.println(v2==v3);
		float v4=1.0f;
		System.out.println(v3==v4);
		double v5=0.1;
		double v6=0.1f;
		System.out.println(v5==v6);
		
		int v10=10;
		int v20=20;
		boolean result2=v10>=10&&v20<=20;
		System.out.println(result2);
		//&&, || short circuit operator
		//연산자 앞은 표현식에 따라 뒷 부분 표현식을 실행하지 않을 수 있다. p.122
		
		int score=95;
		char grade=(score>90)?'A':'B';
		if(score>90) {
			grade='A';	
		}else {
			grade='B';
		}

	}

}
