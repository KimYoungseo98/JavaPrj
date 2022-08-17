package com.kosa.myapp;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputExample {

	public static void main(String[] args) throws Exception{
		//파일에서 정보를 읽어 화면에 출력하는 프로그램
		//byte단위로 읽겠다
		FileInputStream in= new FileInputStream("test.txt");
		FileOutputStream out=new FileOutputStream("test2.txt");
		
		byte[] buffer=new byte[10];
		int readCount=in.read(buffer);//읽어들인 바이트 수를 반환
		while (readCount!=-1) {
			String data=new String(buffer,0,readCount); //buffer 전체를 스트링으로 읽으면 쓰레기값이 들어간다
			System.out.print(data);
			out.write(buffer,0,readCount);
			readCount=in.read(buffer);
		}
		out.flush();
		out.close();
		in.close();
		
//		int data=-1;
//		do {
//			data=in.read();
//			System.out.println((char)data);
//		}while(data!=-1);
		//int data=in.read();
		//System.out.println(data);

	}

}
