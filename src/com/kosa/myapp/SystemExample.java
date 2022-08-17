package com.kosa.myapp;
import java.util.*;
public class SystemExample {

	public static void main(String[] args) {
		long start=System.nanoTime(); //현재 시간 읽기
		long now =System.currentTimeMillis();
		System.out.println(now);
		Date date=new Date(now);
		System.out.println(date);
		System.exit(0);
		long end=System.nanoTime();
		System.out.println(end-start);

	}

}
