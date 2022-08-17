package com.kosa.myapp;

public class HelloDBRepository implements IHelloRepository {

	@Override
	public String sayHello(String name) {
		System.out.println("DB에 저장");
		return "DB-"+name;
	}

}
