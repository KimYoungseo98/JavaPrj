package sec01.exam02;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap=new HashMap<Key, String>();
		
		hashMap.put(new Key(1), "전원우"); //식별키로 String 저장
		
		String value=hashMap.get(new Key(1)); //읽어옴
		System.out.println(value); //저장할 때와 읽을 대의 new Key()는 다른 객체이지만 해시맵의 해시코드의 리턴값은 같아
									//equals()에서 동등한 식별키로 인식함

	}

}
