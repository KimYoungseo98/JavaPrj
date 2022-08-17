package com.kosa.myapp.in;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Byte2CharExample {

	public static void main(String[] args) throws Exception{
		InputStream in=System.in;
		//int data=in.read();
		//System.out.println((char)data);
		
		Reader reader=new InputStreamReader(in);
		BufferedReader br=new BufferedReader(reader);
		String input=br.readLine();
		System.out.println(input);
		
//		int data2=reader.read();
//		System.out.println((char)data2);
//		System.out.println(data2);
		
//		BufferedInputStream br=new BufferedInputStream(System.in);
//		byte[] input=br.readAllBytes();
//		System.out.println(new String(input));
		

	}

}
