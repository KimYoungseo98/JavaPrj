package sec01.exam04;

import sec01.exam03.RemoteControl;

public class RemoteControlExample {//인터페이스 변수에 구현 객체 대입

	public static void main(String[] args) {
		RemoteControl rc; //구현 객체를 사용하려면 변수를 설정하고 
		rc = new Television(); //구현 객체를 대입해야 함
		rc = new Audio();

	}

}
