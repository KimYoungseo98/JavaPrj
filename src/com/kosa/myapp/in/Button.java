package com.kosa.myapp.in;
//실제 눈에 보이는 버튼이 아님
public class Button {
	 static interface OnClickListener{
		 void onClick(); //추상메소드
	 }
	 OnClickListener listener;
	 
	 void setOnClickListener(OnClickListener listener) {
		 this.listener=listener;
	 }
	 void touch() {
		 listener.onClick();
	 }
}
