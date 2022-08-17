package a.c;

import a.b.ClassA;

public class ClassC {
	public void doIt() {
		ClassA clsA=new ClassA(); //다른 패키지여서 참조 불가 -> import a.b.ClassA 필요
		System.out.println(clsA.a);
		//System.out.println(clsA.b); //상속관계가 필요
		//System.out.println(clsA.c);
		//System.out.println(clsA.d);
	}

}
