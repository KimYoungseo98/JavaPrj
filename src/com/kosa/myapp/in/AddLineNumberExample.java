package com.kosa.myapp.in;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AddLineNumberExample {

	public static void main(String[] args) throws Exception {
		String filePath="sample.java";
		BufferedReader in=new BufferedReader(new FileReader(filePath));
		String line=null;
		int lineNumber=0;
		while((line=in.readLine())!=null) {
			lineNumber+=1;
			System.out.println(lineNumber+": "+line);
			
		}

	}

}
