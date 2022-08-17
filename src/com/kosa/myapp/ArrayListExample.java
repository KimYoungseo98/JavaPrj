package com.kosa.myapp;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		class Cat {
			public void printInfo() {
				System.out.println("123456");
			}
		}
		ArrayList list = new ArrayList();
		list.add(10);
		list.add("HelloWorld");
		list.add(new Cat());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for (Object obj : list) {
			System.out.println(obj);
		}
		Object c1 = list.get(2);
		// c1.printInfo(); //printInfo는 Object에 없으니까
		Cat c2 = (Cat) c1;
		c2.printInfo();

		// <>안에 넣고싶은 타입
		List<Cat> cats = new ArrayList<>();
		cats.add(new Cat());
		Cat c3 = cats.get(0);

	}

}
