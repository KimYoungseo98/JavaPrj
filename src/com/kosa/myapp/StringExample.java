package com.kosa.myapp;

public class StringExample {

	public static void main(String[] args) {
		String temp = "Hello JAVA";
		byte[] bytes = temp.getBytes();
		for (byte data : bytes) {
			System.out.println(data);
		}

	}

}
