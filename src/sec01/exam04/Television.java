package sec01.exam04;

import sec01.exam03.RemoteControl;

public class Television implements RemoteControl{//인터페이스의 구현 객체를 가진 구현 클래스
	private int volume;
	
	public void turnOn() {//추상메소드의 실제 메소드
		System.out.println("TV를 켭니다.");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	public void setVolume(int volume) { //인터페이스의 상수를 이용해서 volume필드의 값을 제한
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("현재 tv볼륨: "+this.volume);
	}
	

}
