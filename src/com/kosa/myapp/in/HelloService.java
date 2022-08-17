package com.kosa.myapp.in;

public class HelloService {
	
	IHelloDao dao;
	public HelloService(IHelloDao dao) {
		this.dao=dao;
	}
	
	public void prosess(int data) {
		dao.insert(data);
		dao.update(data);
		try {
			String result=dao.select("Hello.text");
			System.out.println("서비스 결과: "+result);
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		dao.delete();
	}
}
