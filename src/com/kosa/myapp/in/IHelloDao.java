package com.kosa.myapp.in;

public interface IHelloDao {
	void insert(int data);
	void update(int data);
	void delete();
	String select(String fileName);
	}
