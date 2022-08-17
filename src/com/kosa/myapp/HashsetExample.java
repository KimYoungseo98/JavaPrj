package com.kosa.myapp;

import java.util.HashSet;
import java.util.Set;

public class HashsetExample {

	public static void main(String[] args) {
		class Cat{
			String name;
			Cat(String name){
				this.name=name;
			}
			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + ((name == null) ? 0 : name.hashCode());
				return result;
			}
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Cat other = (Cat) obj;
				if (name == null) {
					if (other.name != null)
						return false;
				} else if (!name.equals(other.name))
					return false;
				return true;
			}
			void printInfo() {
				System.out.println(name+" 고양이가 애옹");
			}
		}
		Set<Cat> cats=new HashSet<>();
		Cat c1=new Cat("나비");
		System.out.println(cats.add(c1));
		System.out.println(cats.add(c1));
		for(Cat c:cats) {
			c.printInfo();
		}
		Cat c2=new Cat("나비");
		System.out.println(cats.add(c2));
		
	}

}
