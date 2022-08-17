package sec04.exam01;

public class PrintfExample {

	public static void main(String[] args) throws Exception{
		/*int value=123;
		System.out.printf("상품의 가격:%d원\n",value);
		System.out.printf("상품의 가격:%6d원\n",value);
		System.out.printf("상품의 가격:%-6d원\n",value);
		System.out.printf("상품의 가격:%06d원\n",value);
		
		double area=3.14159*10*10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n",10,area);
		
		String name="홍길동";
		String job="도적";
		System.out.printf("%6d|%-10s|%10s\n",1,name,job);
		System.out.println("배고파"); */
		
		
		int keyCode;
		while(true) {
			keyCode=System.in.read();
			if(keyCode==113) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println(keyCode);
		}
		//System.in.read()로 문자열의 내용을 여러자로 입력받고 싶을 때
		//p.97
		//byte[] buffer=new byte[100];
		//int readCount=System.in.read(buffer);
		//System.out.println(readCount);
		//String data=new String(buffer,0,readCount);
		//System.out.println(data);
	}

}
