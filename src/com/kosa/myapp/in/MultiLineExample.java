package com.kosa.myapp.in;

import java.util.Scanner;

public class MultiLineExample {
	public static void main(String[] args) {
		Scanner scanner=new  Scanner(System.in);
		//String, StringBuffer, StringBuilder
		StringBuilder lines=new StringBuilder();
		while(scanner.hasNextLine()) {
			String line=scanner.nextLine();
			if("".equals(line.trim())) {//문자열의 앞뒤 공백
				break;
			}else {
				lines.append(line+"\n");
			}
		}
		System.out.println(lines);
	}
}
