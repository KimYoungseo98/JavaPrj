package com.kosa.myapp;

public class HelloMain {

	public static void main(String[] args) {
		IHelloRepository helloRepository=new HelloDBRepository();
		HelloService service= new HelloService(helloRepository);
		String result=service.sayHello("홍길동");
		System.out.println(result);
	}

}
