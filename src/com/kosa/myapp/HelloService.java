package com.kosa.myapp;

public class HelloService {
	
	IHelloRepository helloRepository;
	
	public HelloService(IHelloRepository helloRepository) {
		this.helloRepository=helloRepository;
	}
	public String sayHello(String name) {
		return "Hello~ " + helloRepository.sayHello(name);
	}
}
