package com.kosa.myapp;

public class ObjectEqualsExample {
	public static void main(String[] args) {
		Tiger t1=new Tiger("1234","호시",27);
		Tiger t2=new Tiger("1234","호시",27);
		Tiger t3=new Tiger("2345","호시",27);
		
		System.out.println(t1=t2); //false
		System.out.println(t1.equals(t2)); //false
		//true가 나오게 하려면 Tiger에다가 equals메소드를 재정의
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
		System.out.println(t1.equals(t2));
		if(t1.hashCode() !=t3.hashCode()) {
			System.out.println("해시코드가 다른 객체임"); 
			//두 객체의 해시코드가 다르면 두 객체는 반드시 다른 객체
			//다른 객체라도 해시코드가 같을수있음
		}else {
			if(t1.equals(t3)) {
				System.out.println("같은 객체임");
			}else {
				System.out.println("같은 객체임");
			}
		}
		System.out.println(t1.toString());
		//객체 동등 비교에 equals()와 hashCode가 사용된다
	}
}
