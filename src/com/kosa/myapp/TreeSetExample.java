package com.kosa.myapp;
import java.util.*;
public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<String> tree1=new TreeSet<>();
		tree1.add("Hello");
		tree1.add("apple");
		tree1.add("nice");
		tree1.add("이지훈");
		System.out.println(tree1);
		TreeSet<Book> tree2=new TreeSet<>(new BookComparator());
		tree2.add(new Book("1234","java","이석민",25000));
		tree2.add(new Book("5678","sql","김민규",30000));
		tree2.add(new Book("9100","html","서명호",18000));
		System.out.println(tree2);
	}

}
//비교기
class BookComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		//return o1.title.compareTo(o2.title);
		return o1.price-o2.price; //price의 오름차순
	}
	
}
class Book /*implements Comparable<Book>*/{
	String isdb;
	String title;
	String author;
	int price;
	
	//생성자
	public Book(String isdb, String title, String author, int price) {
		super();
		this.isdb = isdb;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	//toString
	@Override
	public String toString() {
		return "Book [isdb=" + isdb + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
//
//	@Override
//	public int compareTo(Book o) { //treeset에 뭔가를 넣을 때 사용
//		//return this.isdb.compareTo(o.isdb);
//		//return this.price-o.price;
//		return -(this.price-o.price);
//	}

	
}
