package com.kosa.myapp;
import java.util.*;
public class MapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<>();
		map.put("abc", 100);
		map.put("hello", 200);
		map.put("world", 200); //value가 같아도 key가 달라야 함
		
		Set<String> keys=map.keySet(); //key값들을 뽑아냄
		for(String key:keys) {
			System.out.println(map.get(key));
		}
	}
}
