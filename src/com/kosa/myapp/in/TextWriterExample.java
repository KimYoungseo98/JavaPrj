package com.kosa.myapp.in;

import java.io.FileWriter;

public class TextWriterExample {

	public static void main(String[] args) throws Exception {
//		String name="최승철";
//		String address="서울시 강남구";
//		String email="scoups@naver.com";
//		int age=25;
//		FileWriter writer=new FileWriter("member.csv");
//		String str=name+", "+address+", "+email+", "+age;
//		writer.write(str+"\n");
//		writer.write(str+"\n");s
//		writer.flush();
//		writer.close();
//		
		String name = "홍길동";
		String address = "서울시 강남구";
		String email = "hong@hong.com";
		int age = 25;
		FileWriter writer = new FileWriter("member.csv");
		String str = name + "," + address + "," + email + "," + age;
		writer.write(str + "\n");
		writer.write(str + "\n");
		writer.flush();
		writer.close();

	}

}
