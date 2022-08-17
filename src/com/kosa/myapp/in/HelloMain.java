package com.kosa.myapp.in;

public class HelloMain {

	public static void main(String[] args) {
		IHelloDao dao=new HelloDao();
		HelloService service=new HelloService(dao);
		service.prosess(100);

	}

}
