package a.c;

import a.b.ClassA;

public class ClassD extends ClassA{
	public void doIt() {
		System.out.println(a);
		System.out.println(b); //상속관게가 있으면 참조 가능
		//System.out.println(c);
		//System.out.println(d); //private는 클래스가 다르면 참조불가
	}

}
