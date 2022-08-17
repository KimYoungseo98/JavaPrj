package com.kosa.myapp;

public class ApiExampleMain {
	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		String s3=new String("Hello");
		String s4=new String("Hello");
		
		System.out.println(s1==s2); //같은 주소를 참조하는지 비교할 때
		System.out.println(s1==s3); //false
		System.out.println(s3==s4); //true
		
		System.out.println(s1.equals(s3)); //string문자열을 비교할 때
		
		ApiExample a1=new ApiExample();
		ApiExample a2=new ApiExample();
		
		System.out.println(a1==a2); //false
		System.out.println(a1.equals(a2)); //false
	}
}
