package com.kosa.myapp.in;

import java.io.BufferedReader;
import java.io.FileReader;

public class TextReaderExample {

	public static void main(String[] args) throws Exception {
		String name=null;
		String address=null;
		String email=null;
		int age=0;
		
		FileReader reader=new FileReader("member.csv");
		BufferedReader br=new BufferedReader(reader);
		String line=null;
		while((line=br.readLine())!=null) {
			String[] member=line.split(",");
			name=member[0];
			address=member[1];
			email=member[2];
			age=Integer.parseInt(member[3]);
			System.out.printf("%s %s %s %d \n",name, address, email, age);
			
		}
		br.close();
		reader.close();
	}

}
