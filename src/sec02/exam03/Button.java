package sec02.exam03;

public class Button {
	
	static interface OnClickListener { // 충첩인터페이스
		void onClick();
	}

	OnClickListener listener; // 인터페이스 타입 필드

	void setOnClickListener(OnClickListener listener) { //외부에서 구현 객체를 받아 필드에 대입
		this.listener = listener;
	}

	void touch() {
		listener.onClick(); // 구현 객체의 onClick()메소드 호출
	}

}
